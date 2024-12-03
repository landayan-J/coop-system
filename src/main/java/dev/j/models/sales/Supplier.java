package dev.j.models.sales;


import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXStringProperty;

public class Supplier extends FXModel {
    private final FXStringProperty suppliername;
    private final FXStringProperty address;

    public Supplier(String suppliername, String address){
        this.suppliername = new FXStringProperty(suppliername);
        this.address = new FXStringProperty(address);

        track_properties(this.suppliername,this.address);
    }

    public FXStringProperty suppliernameProperty(){
        return suppliername;
    }

    public String getSupplier(){
        return suppliernameProperty().get();
    }

    public void setSupplier(String supplier){
        suppliernameProperty().set(supplier);
    }

    public FXStringProperty addressProperty(){
        return address;
    }

    public String getAddress(){
        return addressProperty().get();
    }

    public void setAddress(String address){
        addressProperty().set(address);
    }

    @Override
    public FXModel clone() {
      return new Supplier(getSupplier(), getAddress());
    }

    @Override
    public void copy(FXModel arg0) {
       Supplier c = (Supplier) arg0;

       setSupplier(c.getSupplier());
       setAddress(c.getAddress());
    }
}
