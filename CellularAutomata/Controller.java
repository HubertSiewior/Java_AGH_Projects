package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;


public class Controller implements Initializable {
    @FXML
    Button startButton;
    @FXML
    Canvas canvas;
    @FXML
    TextField rule;
    @FXML
    TextField numberOfIterations;
    @FXML
    TextField sizeOfGrid;
    @FXML
    ChoiceBox periodic;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        periodic.setItems(FXCollections.observableArrayList("yes","no"));
        periodic.setValue("yes");
        rule.appendText("90");
        sizeOfGrid.appendText("50");
        numberOfIterations.appendText("100");
    }
    public void clickStartButton() {
        String ifPeriodic = (String) periodic.getValue();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        int N=Integer.parseInt(numberOfIterations.getText());
        int size = Integer.parseInt(sizeOfGrid.getText());
        int[]rules=getRulesInBinary();
        CellularAutomata ca = new CellularAutomata(rules,N,size,ifPeriodic);
        int[][]grid=ca.getGrid();
        Drawing.drawGrid(canvas,grid,N,size);
    }
    public int[] getRulesInBinary(){
        int[] arr=new int[8];
        String bin =Integer.toBinaryString( Integer.parseInt(rule.getText()));
        bin="0".repeat(8-bin.length())+bin;
        char[] chars = bin.toCharArray();
        for(int i=0;i<8;i++){
            if(chars[i]=='0') arr[i]=0;
            else arr[i]=1;
        }
        return arr;
    }

    public static void closeProgram() {
        Platform.exit();
        System.exit(0);
    }
}
