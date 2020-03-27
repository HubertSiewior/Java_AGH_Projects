package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;

public class Task {
    private SimpleStringProperty tittle, priority, expDate, description;
    private Color color;

    public Task(String tittle, String priority, String expDate, String description) {
        this.tittle = new SimpleStringProperty(tittle);
        this.priority = new SimpleStringProperty(priority);
        this.expDate = new SimpleStringProperty(expDate);
        this.description = new SimpleStringProperty(description);
        if(priority == "LOW") this.color = Color.GREEN;
        if(priority=="MEDIUM") this.color=Color.RED;
        if(priority=="HIGH") this.color=Color.BLUE;
    }
    public Task(){
        this.tittle=new SimpleStringProperty("");
        this.priority=new SimpleStringProperty("medium");
        this.expDate =new SimpleStringProperty("");
        this.description=new SimpleStringProperty("");
    }


    public String getTittle() {
        return tittle.get();
    }

    public SimpleStringProperty tittleProperty() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle.set(tittle);
    }

    public String getPriority() {
        return priority.get();
    }

    public SimpleStringProperty priorityProperty() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority.set(priority);
    }

    public String getExpDate() {
        return expDate.get();
    }

    public SimpleStringProperty expDateProperty() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate.set(expDate);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }
}
