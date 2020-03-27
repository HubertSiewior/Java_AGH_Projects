package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;


public class EditTaskController {

    ObservableList<String> list = FXCollections.observableArrayList("LOW", "MEDIUM", "HIGH");
    @FXML
    private TextField tittle;

    @FXML
    private ChoiceBox priority;

    @FXML
    private TextField expDate;

    @FXML
    private TextArea description;

    @FXML
    public Button buttonEdit;

    @FXML
    public void initialize(Task task){
        priority.setItems(list);
        tittle.setText(task.getTittle());
        priority.setValue(task.getPriority());
        expDate.setText(task.getExpDate());
        description.setText(task.getDescription());
    }
    public ObservableList<String> getValues(){
        ObservableList<String> listOfValues = FXCollections.observableArrayList();
        listOfValues.add(tittle.getText());
        listOfValues.add((String) priority.getValue());
        listOfValues.add(expDate.getText());
        listOfValues.add(description.getText());

        return listOfValues;
    }
}