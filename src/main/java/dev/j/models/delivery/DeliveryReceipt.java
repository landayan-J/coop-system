package dev.j.models.delivery;

import dev.j.models.sales.Supplier;
import dev.j.models.user.User;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class DeliveryReceipt extends FXModel{
    private final FXStringProperty dridnum;
    private final FXObjectProperty<Supplier> supplierid;
    private final FXIntegerProperty datedel;
    private final FXLongProperty totalamt;
    private final FXLongProperty paidamt;
    private final FXObjectProperty<User> userid;

    public DeliveryReceipt(String dridnum, Supplier supplierid, Integer datedel, long totalamt, long paidamt, User userid){
        this.dridnum = new FXStringProperty(dridnum);
        this.supplierid = new FXObjectProperty<>(supplierid);
        this.datedel = new FXIntegerProperty(datedel);
        this.totalamt = new FXLongProperty(totalamt);
        this.paidamt = new FXLongProperty(paidamt);
        this.userid = new FXObjectProperty<User>(userid);

        track_properties(this.dridnum,
        this.supplierid,
        this.datedel,
        this.totalamt,
        this.paidamt,
        this.userid);
    }

    public FXStringProperty dridnumProperty(){
        return dridnum;
    }

    public String getDridNum(){
        return dridnumProperty().get();
    }

    public void setDridNum(String dridnum){
        dridnumProperty().set(dridnum);
    }

    public FXObjectProperty<Supplier> supplieridProperty(){
        return supplierid;
    }

    public Supplier getSupplierID(){
        return supplieridProperty().get();
    }

    public void setSupplierID(Supplier supplierid){
        supplieridProperty().set(supplierid);
    } 

    public FXIntegerProperty datadelProperty(){
        return datedel;
    }

    public Integer getDataDel(){
        return datadelProperty().get();
    }

    public void setDataDel(Integer datadel){
        datadelProperty().set(datadel);
    }

    public FXLongProperty totalamtProperty(){
        return totalamt;
    }

    public long getTotalAmt(){
        return totalamtProperty().get();
    }

    public void setTotalAmt(long totalamt){
        totalamtProperty().set(totalamt);
    }

    public FXLongProperty paidamtProperty(){
        return paidamt;
    }

    public long getPaidAmt(){
        return paidamtProperty().get();
    }

    public void setPaidAmt(long paidamt){
        paidamtProperty().set(getPaidAmt());
    }

    public FXObjectProperty<User> useridProperty(){
        return userid;
    }

    public User getUserID(){
        return useridProperty().get();
    }

    public void setUserID(User userid){
        useridProperty().set(userid);
    }

    @Override
    public FXModel clone() {
       return new DeliveryReceipt(getDridNum(), getSupplierID(), getDataDel(), getTotalAmt(), getPaidAmt(), getUserID());
    }

    @Override
    public void copy(FXModel arg0) {
      DeliveryReceipt c = (DeliveryReceipt) arg0;

      setDataDel(c.getDataDel());
      setDridNum(c.getDridNum());
      setPaidAmt(c.getPaidAmt());
      setSupplierID(c.getSupplierID());
      setTotalAmt(c.getTotalAmt());
      setUserID(c.getUserID()); 
    }
    
}
