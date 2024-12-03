package dev.j.models.hr;

import java.util.UUID;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXStringProperty;
import javafx.scene.control.ListCell;

public class Office extends FXModel {

    public static class LIST_CELL extends ListCell<Office>  {

    }

    
    private final FXStringProperty officename;

    public Office( UUID id,String officename){

        super(id);
       
        this.officename = new FXStringProperty(officename);

        track_properties( this.officename);
    }


    public FXStringProperty officenameProperty(){
        return officename;
    }

    public String getOfficeName(){
        return officenameProperty().get();
    }

    public void setOfficeName(String officename){
        officenameProperty().set(getOfficeName());
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
