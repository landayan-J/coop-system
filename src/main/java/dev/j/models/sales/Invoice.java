package dev.j.models.sales;

import java.lang.reflect.Member;
import java.time.LocalDate;

import dev.j.models.user.User;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Invoice extends FXModel {
    private final FXStringProperty invoicenum;
    private final FXLongProperty totalamount;
    private final FXObjectProperty<Member> memberid;
    private final FXObjectProperty<User> userid;
    private final FXObjectProperty<LocalDate> date;

    public Invoice(String invoicenum, long totalamount,Member memberid, User userid, LocalDate date ){
        this.invoicenum = new  FXStringProperty(invoicenum);
        this.totalamount = new FXLongProperty(totalamount);
        this.memberid = new FXObjectProperty<>(memberid);
        this.userid = new FXObjectProperty<>(userid);
        this.date = new FXObjectProperty<>(date);

        track_properties(this.invoicenum,
        this.totalamount,
        this.memberid,
        this.userid, 
        this.date);
    }

    public FXStringProperty invoicenumProperty(){
        return invoicenum;
    }

    public String getInvoiceNum(){
        return invoicenumProperty().get();
    }

    public void setInvoiceNum(String invoicenum){
        invoicenumProperty().set(invoicenum);
    }

    public FXLongProperty totalamountProperty(){
        return totalamount;
    }

    public long getTotalAmount(){
        return totalamountProperty().get();
    }

    public void setTotalAmount(long totalamount){
        totalamountProperty().set(totalamount);

    }

    public FXObjectProperty<Member> memberidProperty(){
        return memberid;
    }

    public Member getMemberID2(){
        return memberidProperty().get();
    }

    public void setMemberID2(Member memberid){
        memberidProperty().set(memberid);
    }

    public FXObjectProperty<User> useridProperty(){
        return userid;
    }

    public User getUserID(){
        return useridProperty().get();
    }

    public void setUser(User userid){
        useridProperty().set(userid);
    }

    public FXObjectProperty<LocalDate> dateProperty(){
        return date;
    }

    public LocalDate getDate(){
        return dateProperty().get();
    }

    public void setDate(LocalDate date){
        dateProperty().set(date);
    }

    @Override
    public FXModel clone() {
       return new Invoice(getInvoiceNum(), getTotalAmount(), getMemberID2(), getUserID(), getDate());
    }

    @Override
    public void copy(FXModel arg0) {
      Invoice c = (Invoice) arg0;

      setDate(c.getDate());
      setInvoiceNum(c.getInvoiceNum());
      setMemberID2(c.getMemberID2());
      setTotalAmount(c.getTotalAmount());
      setUser(c.getUserID());
    }
    
}
