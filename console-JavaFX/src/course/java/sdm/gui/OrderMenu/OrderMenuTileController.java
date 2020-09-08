package course.java.sdm.gui.OrderMenu;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

public class OrderMenuTileController {

    @FXML    private Label OrderIdLabel;

    @FXML    private Label DateLabel;

    @FXML    private Label UserNameLabel;

    @FXML    private Label LocationLabel;

    @FXML    private Label OrderTypeLabel;

    @FXML    private TitledPane ItemTile;

    @FXML    private AnchorPane ItemsPane;

    @FXML    private TitledPane StoreTile;

    @FXML    private AnchorPane StoresPane;

    @FXML    private Label ItemPriceLabel;

    @FXML    private Label ShippingPriceLabel;

    @FXML    private Label TotalPriceLabel;


    @FXML
    private void initialize() {
        ItemTile.setExpanded(false);
        StoreTile.setExpanded(false);
    }

    public void setValues (String ID, String Date, String UserName, String Location, String OrderType, ScrollPane items,ScrollPane Stores,
                           String PriceShipping,String PriceItems,String PriceTotal) {
        OrderIdLabel.setText(ID);
        DateLabel.setText(Date);
        UserNameLabel.setText(UserName);
        LocationLabel.setText(Location);
        OrderTypeLabel.setText(OrderType);
        ItemPriceLabel.setText(PriceItems);
        ShippingPriceLabel.setText(PriceShipping);
        TotalPriceLabel.setText(PriceTotal);
        StoresPane.getChildren().add(Stores);
        ItemsPane.getChildren().add(items);
    }

}
