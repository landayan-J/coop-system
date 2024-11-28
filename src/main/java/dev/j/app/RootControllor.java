package dev.j.app;


import java.util.Collections;
import java.util.Comparator;

import atlantafx.base.theme.Styles;
import atlantafx.base.util.Animations;
import dev.j.App;
import dev.j.data.MemberDAO;
import dev.j.models.Member;
import dev.sol.core.application.FXController;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class RootControllor extends FXController {

    @FXML
    private TableView<Member> memberTable;

    @FXML
    private TableColumn<Member, Integer> memberIdColumn;

    @FXML
    private TableColumn<Member, String> fnameColumn;

    @FXML
    private TableColumn<Member, String> lnameColumn;

    @FXML 
    private TableColumn<Member, Long> amountpaidColumn;

    @FXML
    private TextField fnameField;

    @FXML
    private void handleAddMember(){
        if (fnameField.getText().isEmpty()) {
            fnameField.pseudoClassStateChanged(Styles.STATE_DANGER, true);
            Animations.flash(fnameField).playFromStart();
            return;
        }
        Collections.sort(member_masterlist, Comparator.comparing(Member::getEmpID));
        int id_int = Integer.parseInt( member_masterlist.getLast().getMemberId()) + 1;
        String emp_id = Integer.toString(id_int);

        Employee employee = new Employee(emp_id,
                nameField.getText(),
                jobField.getValue(),
                managerField.getValue(),
                departmentField.getValue());
        EmployeeDAO.insert(employee);
        employee_masterlist.add(employee);
        reset_newEmployeeFields();
    }

    }

    @FXML
    private void handleSave(){

    }

    @FXML
    private void handledelete(){
        Member selectedmember = memberTable.getSelectionModel().getSelectedItem();
        if (selectedmember == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Fail to Delete");
            alert.setHeaderText("No Selected Member");
            alert.setContentText("Select First Before Deleting");
            alert.initOwner(scene.getWindow());
            alert.show();
            return;
        }
        member_masterlist.remove(selectedmember);
        MemberDAO.delete(selectedmember);
    }
    private ObservableList<Member> memberList;
    private ObservableList<Member> member_masterlist;

    private Scene scene;

    @Override
    protected void load_fields() {
        scene = (Scene) getParameter("SCENE");
        member_masterlist = App.COLLECTIONS_REGISTER.getList("MEMBER");
      memberList = new FilteredList<>(member_masterlist, p -> true);

        memberIdColumn.setCellValueFactory(cell -> cell.getValue().memberIdProperty().asObject());
        fnameColumn.setCellValueFactory(cell -> cell.getValue().fnameProperty());
        lnameColumn.setCellValueFactory(cell -> cell.getValue().lnameProperty());
        amountpaidColumn.setCellValueFactory(cell -> cell.getValue().amountpaidProperty().asObject());

        memberTable.setItems(member_masterlist);
    }

    

    @Override
    protected void load_bindings() {
       
    }

    @Override
    protected void load_listeners() {
       
    }
    
}
