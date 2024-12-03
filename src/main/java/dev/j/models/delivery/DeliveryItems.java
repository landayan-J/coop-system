package dev.j.models.delivery;

import dev.j.models.sales.Stock;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;

public class DeliveryItems extends FXModel{
    private final FXObjectProperty<Stock> stockid;
    private final FXLongProperty buyingprice;
    private final FXDoubleProperty qty;
    private final FXLongProperty amount;

    public DeliveryItems(Stock stockid, long buyingprice, double qty, long amount){
        this.stockid = new FXObjectProperty<>(stockid);
        this.buyingprice = new FXLongProperty(buyingprice);
        this.qty = new FXDoubleProperty(qty);
        this.amount = new FXLongProperty(amount);

        track_properties(this.stockid,
        this.buyingprice, 
        this.qty,
        this.amount);
    }

    public FXObjectProperty<Stock> stockidProperty(){
        return stockid;
    }

    public Stock getStockID(){
        return stockidProperty().get();
    }

    public void  setStockID(Stock stockid){
        stockidProperty().set(getStockID());
    }

    public FXLongProperty buyingpriceProperty(){
        return buyingprice;
    }

    public long getBuyingPrice(){
        return buyingpriceProperty().get();
    }

    public void setBuyingPrice(long buyingprice){
        buyingpriceProperty().set(getBuyingPrice());
    }

    public FXDoubleProperty qtyProperty(){
        return qty;
    }

    public double getQTY(){
        return qtyProperty().get();
    }

    public void setQTY(double qty){
        qtyProperty().set(getQTY());
    }

    public FXLongProperty amountProperty(){
        return amount;
    }
 
    public long getamount(){
        return amountProperty().get();
    }

    public void setamount(long amount){
        amountProperty().set(amount);
    }
    @Override
    public FXModel clone() {
      return new DeliveryItems(getStockID(), getBuyingPrice(), getQTY(), getamount());
    }

    @Override
    public void copy(FXModel arg0) {
       DeliveryItems c = (DeliveryItems) arg0;

       setBuyingPrice(c.getBuyingPrice());
       setQTY(c.getQTY());
       setStockID(c.getStockID());
       setamount(c.getamount());
    }
    
}
