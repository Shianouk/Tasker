package sample.Controller;
import javafx.application.Application;
import sample.Model.Model;
import sample.View.View;

import java.util.ArrayList;


public class Controller{

    private View view;
    private Model model;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void setTaskId(String taskId){
        model.setTask(taskId);
    }
    public String getTaskId(){
        return model.getTask();
    }
    public void setTitle(String title){
        model.setTitle(title);
    }
    public String getTitle(){
        return model.getTitle();
    }
    public void setDate(String date){
        model.setDate(date);
    }
    public String getDate(){
        return model.getDate();
    }

    public void updateView(){
        System.out.println(model.getTask()+model.getTitle()+model.getDate());
    }



}
