package dev.j.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Stock extends FXModel{
    private final FXStringProperty description;
    private final FXLongProperty unitprice;
    private final FXLongProperty sellingprice;
    private final  FXLongProperty quantity;
    private final FXStringProperty unit;

    public Stock(String description, long unitprice, long sellingprice, long quantity, final String unit){
        this.description = new FXStringProperty(description);
        this.unitprice = new FXLongProperty(unitprice);
        this.sellingprice = new FXLongProperty(sellingprice);
        this.quantity = new FXLongProperty(quantity);
        this.unit = new FXStringProperty(unit);

        track_properties(this.description,this.unitprice,this.sellingprice,this.quantity,this.unit);
    }

    public FXStringProperty descriptionProperty(){
        return description;
    }

    public String getDescription(){
        return descriptionProperty().get();
    }

    public void setDescription(String description){
        descriptionProperty().set(description);
    }

    public FXLongProperty unitpriceProperty(){
        return unitprice;
    }

    public long getUnitPrice(){
        return unitpriceProperty().get();
    }

    public void setUnitPrice(long unitprice){
        unitpriceProperty().set(unitprice);
    }

    public FXLongProperty sellingpriceProperty(){
        return sellingprice;
    }

    public long getSelling(){
        return sellingpriceProperty().get();
    }

    public void setSelling(long sellingprice){
        sellingpriceProperty().set(sellingprice);
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

    public FXStringProperty unitProperty(){
        return unit;
    }

    public String getUnit(){
        return unitProperty().get();
    }

    public void setUnit(String unit){
        unitProperty().set(unit);
    }

    @Override
    public FXModel clone() {
      return new Stock(getDescription(), getUnitPrice(), getSelling(), getQuantity(), getUnit());
    }

    @Override
    public void copy(FXModel arg0) {
        Stock c = (Stock) arg0;

        setDescription(c.getDescription());
        setUnitPrice(c.getUnitPrice());
        setSelling(c.getSelling());
        setQuantity(c.getQuantity());
        setUnit(c.getUnit());
    }
}
