package dev.j.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;

public class Sales_Items extends FXModel {
    private final FXObjectProperty<Stock> stockid;
    private final FXLongProperty quantity;
    private final FXLongProperty amount;

    public Sales_Items(Stock stockid, long quantity, long amount){
        this.stockid = new FXObjectProperty<>(stockid);
        this.quantity = new FXLongProperty(quantity);
        this.amount = new FXLongProperty(amount);
    }

    public FXObjectProperty<Stock> stockidProperty(){
        return stockid;
    }

    public Stock getStockID(){
        return stockidProperty().get();
    }

    public void setStockID(Stock stockid ){
        stockidProperty().set(stockid);
    }

    public FXLongProperty quantityProperty(){
        return quantity;
    }

    public long getQuantity(){
        return quantityProperty().get();
    }

    public void setQuantity(long quantity){
        quantityProperty().set(quantity);
    }

    public FXLongProperty amountProperty(){
        return amount;
    }

    public long getAmount(){
        return amountProperty().get();
    }

    public void setAmount(long amount){
        amountProperty().set(amount);
    }

    @Override
    public FXModel clone() {
      return new Sales_Items(getStockID(), getQuantity(), getAmount());
    }

    @Override
    public void copy(FXModel arg0) {
        Sales_Items c = (Sales_Items) arg0;

        setStockID(c.getStockID());
        setQuantity(c.getQuantity());
        setAmount(c.getAmount());
    }
    
}
