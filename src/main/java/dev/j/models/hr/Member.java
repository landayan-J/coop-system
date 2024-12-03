package dev.j.models.hr;



import dev.j.enums.CivilStatus;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Member extends FXModel {
    
    private final FXIntegerProperty memberid;
    private final FXStringProperty Fname;
    private final FXStringProperty Mname;
    private final FXStringProperty Lname;
    private final FXStringProperty DateofBirth;
    private final FXStringProperty PlaceofBirth;
    private final FXObjectProperty<CivilStatus> Status;
    private final FXStringProperty CurrentAddress;
    private final FXStringProperty Occupation;
    private final FXIntegerProperty Office;
    private final FXDoubleProperty Salary;
    private final FXStringProperty Sourceofincome;
    private final FXStringProperty Nearestrelative;
    private final FXStringProperty RelationShip;
    private final FXStringProperty Dependent;
    private final FXIntegerProperty Stockshare;
    private final FXLongProperty StockAmount;
    private final FXIntegerProperty StockPaid;
    private final FXLongProperty amountpaid;

    public Member(Integer memberid,
            String Fname,
            String Mname,
            String Lname,
            String DateofBirth,
            String PlaceofBirth,
            CivilStatus Status,
            String CurrentAddress,
            String Occupation,
            Integer Office,
            double Salary,
            String Sourceofincome,
            String Nearestrelative,
            String RelationShip,
            String Dependent,
            Integer Stockshare,
            long StockAmount,
            Integer StockPaid,
            long amountpaid) {

       this.memberid = new FXIntegerProperty(memberid);
        this.Fname = new FXStringProperty(Fname);
        this.Mname = new FXStringProperty(Mname);
        this.Lname = new FXStringProperty(Lname);
        this.DateofBirth = new FXStringProperty(DateofBirth);
        this.PlaceofBirth = new FXStringProperty(PlaceofBirth);
        this.Status = new FXObjectProperty<>(Status);
        this.CurrentAddress = new FXStringProperty(CurrentAddress);
        this.Occupation = new FXStringProperty(Occupation);
        this.Office = new FXIntegerProperty(Office);
        this.Salary = new FXDoubleProperty(Salary);
        this.Sourceofincome = new FXStringProperty(Sourceofincome);
        this.Nearestrelative = new FXStringProperty(Nearestrelative);
        this.RelationShip = new FXStringProperty(RelationShip);
        this.Dependent = new FXStringProperty(Dependent);
        this.Stockshare = new FXIntegerProperty(Stockshare);
        this.StockAmount = new FXLongProperty(StockAmount);
        this.StockPaid = new FXIntegerProperty(StockPaid);
        this.amountpaid = new FXLongProperty(amountpaid);

        track_properties(this.memberid,
                this.Fname,
                this.Mname,
                this.Lname,
                this.DateofBirth,
                this.PlaceofBirth,
                this.Status,
                this.CurrentAddress,
                this.Occupation,
                this.Office,
                this.Salary,
                this.Sourceofincome,
                this.Nearestrelative,
                this.RelationShip,
                this.Dependent,
                this.Stockshare,
                this.StockAmount,
                this.StockPaid,
                this.amountpaid);
    }

    public FXIntegerProperty memberIDProperty() {
        return memberid;
    }

    public Integer getMemberID() {
        return memberIDProperty().get();
    }

    public void setMemberID(Integer memberid) {
        memberIDProperty().set(memberid);
    }

    public FXStringProperty fnameProperty() {
        return Fname;
    }

    public String getFname() {
        return fnameProperty().get();
    }

    public void setFname(String Fname) {
        fnameProperty().set(Fname);
    }

    public FXStringProperty mnameProperty() {
        return Mname;
    }

    public String getMname() {
        return mnameProperty().get();
    }

    public void setMname(String Mname) {
        mnameProperty().set(Mname);
    }

    public FXStringProperty lnameProperty() {
        return Lname;
    }

    public String getLname() {
        return lnameProperty().get();
    }

    public void setLname(String Lname) {
        lnameProperty().set(getLname());
    }

    public FXStringProperty dateofBirthProperty() {
        return DateofBirth;
    }

    public String getDateofBirth() {
        return dateofBirthProperty().get();
    }

    public void setDateofBirth(String DateofBirth) {
        dateofBirthProperty().set(DateofBirth);
    }

    public FXStringProperty placeofBirthProperty() {
        return PlaceofBirth;
    }

    public String getPlaceofBirth() {
        return placeofBirthProperty().get();
    }

    public void setPlaceofBirth(String PlaceofBirth) {
        placeofBirthProperty().set(getDateofBirth());
    }

    public FXObjectProperty<CivilStatus> statusProperty() {
        return Status;
    }

    public CivilStatus getStatus() {
        return statusProperty().get();
    }

    public void setStatus(CivilStatus Status) {
        statusProperty().set(Status);
    }

    public FXStringProperty CurrentAddressProperty() {
        return CurrentAddress;
    }

    public String getCurrentAddress() {
        return CurrentAddressProperty().get();
    }

    public void setCurrentAddress(String CurrentAddress) {
        CurrentAddressProperty().set(CurrentAddress);
    }

    public FXStringProperty occupationProperty() {
        return Occupation;
    }

    public String getOccupation() {
        return occupationProperty().get();
    }

    public void setOccupation(String Occupation) {
        occupationProperty().set(Occupation);
    }

    public FXIntegerProperty OfficeProperty() {
        return Office;
    }

    public Integer getOffice() {
        return OfficeProperty().get();
    }

    public void setOffice(Integer Office) {
        OfficeProperty().set(Office);
    }

    public FXDoubleProperty salaryProperty() {
        return Salary;
    }

    public double getSalary() {
        return salaryProperty().get();
    }

    public void setSalary(double Salary) {
        salaryProperty().set(Salary);
    }

    public FXStringProperty sourceofincomeProperty() {
        return Sourceofincome;
    }

    public String getSourceofincome() {
        return sourceofincomeProperty().get();
    }

    public void setSourceofincome(String Sourceofincome) {
        sourceofincomeProperty().set(getCurrentAddress());
    }

    public FXStringProperty nearestRelativeProperty() {
        return Nearestrelative;
    }

    public String getNearestRelative() {
        return nearestRelativeProperty().get();
    }

    public void setNearestRelative(String NearestRelative) {
        nearestRelativeProperty().set(NearestRelative);
    }

    public FXStringProperty relationshipProperty() {
        return RelationShip;
    }

    public String getRelationShip() {
        return relationshipProperty().get();
    }

    public void setRelationShip(String RelationShip) {
        relationshipProperty().set(getCurrentAddress());
    }

    public FXStringProperty dependentProperty() {
        return Dependent;
    }

    public String getDependent() {
        return dependentProperty().get();
    }

    public void setDependent(String Dependent) {
        dependentProperty().set(Dependent);
    }

    public FXIntegerProperty stockshareProperty() {
        return Stockshare;
    }

    public Integer getStockshare() {
        return stockshareProperty().get();
    }

    public void setStockshare(Integer Stockshare) {
        stockshareProperty().set(Stockshare);
    }

    public FXLongProperty stockamountProperty() {
        return StockAmount;
    }

    public long getStockAmount() {
        return stockamountProperty().get();
    }

    public void setStockAmount(long StockAmount) {
        stockamountProperty().set(getAmountPaid());
    }

    public FXIntegerProperty stockpaidProperty() {
        return StockPaid;
    }

    public Integer getStockPaid() {
        return stockpaidProperty().get();
    }

    public void setStockPaid(Integer StockPaid) {
        stockpaidProperty().set(StockPaid);
    }

    public FXLongProperty amountpaidProperty() {
        return amountpaid;
    }

    public long getAmountPaid() {
        return amountpaidProperty().get();
    }

    public void setAmountPaid(long amountpaid) {
        amountpaidProperty().set(amountpaid);
    }

    @Override
    public FXModel clone() {

        Member member = new Member(getMemberID(), getFname(), getMname(), getLname(), getDateofBirth(), getPlaceofBirth(), getStatus(), getCurrentAddress(), getOccupation(), getOffice(), getSalary(), getSourceofincome(), getNearestRelative(), getRelationShip(), getDependent(), getStockshare(), getStockAmount(), getStockPaid(), getAmountPaid());
        return member;

}

    @Override
    public void copy(FXModel arg0) {
        Member c = (Member) arg0;

        setMemberID(c.getMemberID());
        setFname(c.getFname());
        setMname(c.getMname());
        setLname(c.getLname());
        setAmountPaid(c.getAmountPaid());
        setDateofBirth(getDateofBirth());
        setPlaceofBirth(c.getPlaceofBirth());
        setStatus(c.getStatus());
        setCurrentAddress(c.getCurrentAddress());
        setOccupation(c.getOccupation());
        setOffice(c.getOffice());
        setSalary(c.getSalary());
        setSourceofincome(c.getSourceofincome());
        setNearestRelative(c.getNearestRelative());
        setRelationShip(c.getRelationShip());
        setDependent(c.getDependent());
        setStockshare(c.getStockshare());
        setStockAmount(c.getStockAmount());
        setStockPaid(c.getStockPaid());
    }
}
