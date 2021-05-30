package sample.Model;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.View.View;


public class Model{

    private String task;
    private String title;
    private String date;

    public String getTask() {
        return task;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
