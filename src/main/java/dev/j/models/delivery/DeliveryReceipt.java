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

    @Override
    public FXModel clone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clone'");
    }

    @Override
    public void copy(FXModel arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }
    
}
