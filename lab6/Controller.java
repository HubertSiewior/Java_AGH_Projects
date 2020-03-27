package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
        import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
        import java.util.ResourceBundle;

public  class Controller implements Initializable {

    @FXML
    Button button;
    @FXML
    MenuBar menuBar;
    @FXML
    ListView<Task> toDoTable;
    @FXML
    ListView<Task> inProgressTable;
    @FXML
    ListView<Task> doneTable;
    @FXML
    TableColumn<Task,String> toDoColumn;
    @FXML
    TableColumn<Task,String> inProgressColumn;
    @FXML
    TableColumn<Task,String> doneColumn;
    @FXML
    Button fromToDoButton;
    @FXML
    Button toToDoButton;
    @FXML
    Button fromDoneButton;
    @FXML
    Button toDoneButton;
    @FXML
    Button editButton;
    @FXML
    Button deleteButton;




    public  void addTaskToToDoList(Task a)
    {
    toDoTable.getItems().add( 1,a);
    }
   @FXML
    public void AddNewTask(){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddNewTask.fxml"));
            Parent root1 = (Parent) loader.load();
            Stage stage = new Stage();
            stage.setTitle("nowe okno");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

     //  NewTaskController a=new NewTaskController();
     //  sample.Task task =new sample.Task();
     //  task.setTittle("");





    }

    public void about() {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("Made by Hubert Siewior");
        alert.showAndWait();
    }

    public  void closeProgram(){
        Platform.exit();
        System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
