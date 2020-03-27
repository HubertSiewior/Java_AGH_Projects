package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;


public class NewTaskController {

    ObservableList<String> list = FXCollections.observableArrayList("LOW", "MEDIUM", "HIGH");
    @FXML
    private  TextField tittle;

    @FXML
    private ChoiceBox priority;

    @FXML
    private TextField expDate;

    @FXML
    private TextArea description;

    @FXML
    public Button buttonADD;

    ListView<String> tmpList=new ListView<>();



    @FXML

    private void initialize(){
        priority.setItems(list);
        priority.setValue("MEDIUM");
    }
    public  ObservableList<String> getValues(){
        ObservableList<String> listOfValues = FXCollections.observableArrayList();
        listOfValues.add(tittle.getText());
        listOfValues.add((String) priority.getValue());
        listOfValues.add(expDate.getText());
        listOfValues.add(description.getText());

        return listOfValues;
    }
}