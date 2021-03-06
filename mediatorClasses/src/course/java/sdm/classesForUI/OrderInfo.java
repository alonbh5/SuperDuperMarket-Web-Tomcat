package course.java.sdm.classesForUI;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class OrderInfo {

    public final Long m_OrderSerialNumber;
    public final Date m_Date;
    public final List<StoreInOrderInfo> Stores;
    public List<ItemInOrderInfo> ItemsInOrder;
    public final CustomerInfo customer;
    public final Double m_TotalPrice;
    public final Double m_ShippingPrice;
    public final Double m_ItemsPrice;
    public final Integer m_amountOfItems;
    //public final Double Distance;
    //public final Integer StaticPPK;
    public final boolean isStatic;

    public OrderInfo(long m_OrderSerialNumber, Date m_Date, List<StoreInOrderInfo> stores, List<ItemInOrderInfo> itemsInOrder,
                     Double m_TotalPrice, Double m_ShippingPrice, Double m_ItemsPrice, Integer m_amountOfItems,
                     CustomerInfo customer,boolean isStatic) {
        this.m_OrderSerialNumber = m_OrderSerialNumber;
        this.m_Date = m_Date;
        this.Stores = stores;
        this.ItemsInOrder = itemsInOrder;
        this.m_TotalPrice = Double.parseDouble(String.format("%.2f", m_TotalPrice));
        this.m_ShippingPrice = Double.parseDouble(String.format("%.2f", m_ShippingPrice));
        this.m_ItemsPrice = Double.parseDouble(String.format("%.2f", m_ItemsPrice));
        this.m_amountOfItems = m_amountOfItems;
        //this.Distance = distance;
        //this.StaticPPK=PPK;
        this.customer =   customer;
        this.isStatic=isStatic;
    }

    public String getPointString () {
        return customer.Location;
    }

    public String getDateString () {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.format(m_Date);
    }

    public void makeDynamic(StoreInfo store) {
        if (!this.isStatic) {
            List<ItemInOrderInfo> onlyItemsFromStore = new ArrayList<>();

            for (ItemInOrderInfo cur : ItemsInOrder) {
                if (cur.FromStoreID.equals(store.StoreID)) {
                    onlyItemsFromStore.add(cur);
                }
            }
            ItemsInOrder = onlyItemsFromStore;
        }
    }
}
