package course.java.sdm.engine;

public class ProductInSystem {

    private Item item;
    private int NumberOfSellingStores = 0; //addItemToStore at Store takes care to update system
    private int AmountOfItemWasSold = 0; //addProductToOrder at Order takes care to update system

    public ProductInSystem(Item item) {
        this.item = item;
    }

    Item getItem() {
        return item;
    }

    int getAmountOfItemWasSold() {
        return AmountOfItemWasSold;
    }

    int getNumberOfSellingStores() {
        return NumberOfSellingStores;
    }

    Long getSerialNumber () {return item.serialNumber;}

    Item.payByMethod getPayBy() {
        return item.getPayBy();
    }

    void addSellingStore() {NumberOfSellingStores++;}

    void addTimesSold(int amountToAdd) {AmountOfItemWasSold+=amountToAdd;}

    public void removeSellingStore() {
        NumberOfSellingStores--;
    }
}
