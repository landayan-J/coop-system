package dev.j.app;


import java.util.Collections;
import java.util.Comparator;

import atlantafx.base.theme.Styles;
import atlantafx.base.util.Animations;
import dev.j.App;
import dev.j.data.MemberDAO;
import dev.j.enums.CivilStatus;
import dev.j.models.hr.Member;
import dev.sol.core.application.FXController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
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
    private TextField mnameField;

    @FXML
    private TextField lnameField;

    @FXML 
    private TextField bdayField;

    @FXML
    private TextField placeField;

    @FXML
    private TextField homeField;

    @FXML
    private TextField occupationField;

    @FXML
    private TextField  salaryField;

    @FXML
    private TextField incomeField;

    @FXML
    private TextField relative;

    @FXML
    private TextField stockshareField;

    @FXML
    private TextField stockamountField;

    @FXML
    private TextField stockpaidField;

    @FXML
    private TextField amountField;

    @FXML
    private TextField dependentField;

    @FXML
    private ComboBox civilBox;

    @FXML
    private ComboBox officeComboBox;


    @FXML
    private ComboBox relationBox;







    @FXML
    private void handleAddMember(){
        if (fnameField.getText().isEmpty()) {
            fnameField.pseudoClassStateChanged(Styles.STATE_DANGER, true);
            Animations.flash(fnameField).playFromStart();
            return;
        }
        Collections.sort(member_masterlist, Comparator.comparing(Member::getMemberID));
        int id_int = Integer.valueOf(member_masterlist.getLast().getMemberID()) + 1;
        String memberId = Integer.toString(id_int);

        // Member member = new Member(memberId,
        // fnameField.getText(),
        // mnameField.getText(),
        // lnameField.getText(),
        // bdayField.getText(),
        // placeField.getText(),
        // civilBox.getValue(),
        // homeField.getText(),
        // occupationField.getText(),
        // officeComboBox.getValue()

        // );

        MemberDAO.insert(member);
        member_masterlist.add(member);
        reset_newEmployeeFields();
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
    private Member member;
    private FilteredList<Member> memberFilteredList;

    private Scene scene;

    @Override
    protected void load_fields() {
        scene = (Scene) getParameter("SCENE");
        member_masterlist = App.COLLECTIONS_REGISTER.getList("MEMBER");
      memberList = new FilteredList<>(member_masterlist, p -> true);

        memberIdColumn.setCellValueFactory(cell -> cell.getValue().memberIDProperty().asObject());
        fnameColumn.setCellValueFactory(cell -> cell.getValue().fnameProperty());
        lnameColumn.setCellValueFactory(cell -> cell.getValue().lnameProperty());
        amountpaidColumn.setCellValueFactory(cell -> cell.getValue().amountpaidProperty().asObject());

        memberTable.setItems(member_masterlist);
    }

    

    @Override
    protected void load_bindings() {
        scene = (Scene) getParameter("SCENE");
        member_masterlist = App.COLLECTIONS_REGISTER.getList("MEMBER");
        memberFilteredList = new FilteredList<>(member_masterlist, p -> true);

        memberIdColumn.setCellValueFactory(cell -> cell.getValue().memberIDProperty().asObject());
        lnameColumn.setCellValueFactory(cell -> cell.getValue().lnameProperty());
        fnameColumn.setCellValueFactory(cell -> cell.getValue().fnameProperty());
        amountpaidColumn.setCellValueFactory(cell -> cell.getValue().amountpaidProperty().asObject());

        ObservableList<CivilStatus> joblist = FXCollections.observableArrayList(CivilStatus.values());
        if (member_masterlist.stream().anyMatch(e -> e.getStatus().equals(CivilStatus.WIDOW))) {
            civilBox.setItems(FXCollections.observableArrayList(joblist.subList(1, joblist.size())));

        } else
            civilBox.setItems(joblist);

        memberTable.setItems(member_masterlist);
    }

    @Override
    protected void load_listeners() {
        memberTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            member = newValue;
            _bind_labelProperties();
        });

    }

    public void _bind_labelProperties(){
        if (member != null) {
            fnameField.textProperty().bind(member.fnameProperty());
            lnameField.textProperty().bind(member.lnameProperty());
            mnameField.textProperty().bind(member.mnameProperty());
            bdayField.textProperty().bind(member.dateofBirthProperty());
            placeField.textProperty().bind(member.placeofBirthProperty());
            homeField.textProperty().bind(member.CurrentAddressProperty());
            occupationField.textProperty().bind(member.occupationProperty());
            incomeField.textProperty().bind(member.sourceofincomeProperty());
            relative.textProperty().bind(member.relationshipProperty());
            dependentField.textProperty().bind(member.dependentProperty());
            

        }
    }

    private void reset_newEmployeeFields() {
        fnameField.setText("");
        civilBox.getSelectionModel().selectFirst();
    }
    
}
