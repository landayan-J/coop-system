package dev.j.models.user;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class User extends FXModel {

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    private  FXStringProperty username;
    private  FXStringProperty designation;
    private FXStringProperty fname;
    private FXStringProperty mname;
    private FXStringProperty lname;
    private FXStringProperty address;
    private FXStringProperty password;
    private FXLongProperty salary;

    public User(String username, String designation, String fname, String mname, String lname, String address, String password, long salary){
        this.username = new FXStringProperty(username);
        this.designation = new FXStringProperty(designation);
        this.fname = new FXStringProperty(fname);
        this.mname = new FXStringProperty(mname);
        this.lname = new FXStringProperty(lname);
        this.address = new FXStringProperty(address);
        this.password = new FXStringProperty(password);
        this.salary = new FXLongProperty(salary);

        track_properties(this.username, this.designation, this.fname, this.mname, this.lname, this.address, this.password, this.salary);
    }

    public FXStringProperty usernameProperty(){
        return username;
    }

    public String getUserName(){
        return usernameProperty().get();
    }

    public void setUserName(String username){
        usernameProperty().set(username);
    }

    public FXStringProperty designationProperty(){
        return designation;
    }

    public String getDesignation(){
        return designationProperty().get();
    }

    public void setDesignation(String designation){
        designationProperty().set(designation);
    }

    public FXStringProperty fnameProperty(){
        return fname;
    }

    public String getFname(){
        return fnameProperty().get();
    }

    public void setFname(String fname){
        fnameProperty().set(fname);
    }

    public FXStringProperty mnameProperty(){
        return mname;
    }

    public String getMname(){
        return mnameProperty().get();
    }

    public void setMname(String mname){
        mnameProperty().set(mname);
    }

    public FXStringProperty lnameProperty(){
        return lname;
    }

    public String getLname(){
        return lnameProperty().get();
    }

    public void setLname(String lname){
        lnameProperty().set(lname);
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

    public FXStringProperty passwordProperty(){
        return password;
    }

    public String getPassword(){
        return passwordProperty().get();
    }

    public void setPassword(String password){
        passwordProperty().set(getAddress());
    }

    public FXLongProperty salaryProperty(){
        return salary;
    }

    public long getSalary(){
        return salaryProperty().get();
    }

    public void setSalary(long salary){
        salaryProperty().set(salary);
    }

    @Override
    public FXModel clone() {
       return new User(getUserName(), getDesignation(), getFname(), getMname(), getLname(), getAddress(), getPassword(), getSalary());
    }

    @Override
    public void copy(FXModel arg0) {
       User c = (User) arg0;

       setUserName(c.getUserName());
       setDesignation(c.getDesignation());
       setFname(c.getFname());
       setMname(c.getMname());
       setLname(c.getLname());
       setAddress(c.getAddress());
       setPassword(c.getPassword());
       setSalary(c.getSalary());
    }
}
