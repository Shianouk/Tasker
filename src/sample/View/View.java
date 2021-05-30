package sample.View;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class View {

    {

// (1) Komponenten erzeugen
        Label taskID = new Label("TaskID:");
        Label title = new Label("Title:");
        Label date = new Label("Date:");
        Label done = new Label("Erledigt:");
        TextField taskField = new TextField();
        TextField titleField = new TextField();
        TextField dateField = new TextField();
        Button rButton = new Button(">>");
        Button lButton = new Button("<<");
        Button nButton = new Button("Save/New");
        CheckBox cDone = new CheckBox();

// (2) Layout-Klasse erzeugen und Komp. einsetzen
        HBox taskIDPane = new HBox(taskID,taskField);           //Objekte paarig in Box
        HBox titlePane = new HBox(title,titleField);
        HBox datePane = new HBox(date,dateField);
        VBox entryPane = new VBox(taskIDPane,titlePane,datePane);
        HBox buttonPane = new HBox(lButton,nButton,rButton);
        HBox checkPane = new HBox(done,cDone);
        checkPane.setAlignment(Pos.CENTER);
        entryPane.setAlignment(Pos.CENTER);               //Position der Objekte in der HBox
        buttonPane.setAlignment(Pos.BASELINE_CENTER);         //Position der Objekte in der VBox
        BorderPane pane = new BorderPane();
                          //Setzen der VBox in die Mitte des Boarderpanes
        buttonPane.setPadding(new Insets(10));             //Abstand vom Rand
        buttonPane.setSpacing(10);                            //Abstand zwischen den Objekten
        entryPane.setPadding(new Insets(15));
        entryPane.setSpacing(10);
        checkPane.setSpacing(15);

        taskIDPane.setSpacing(15);                            //Abstand zwischen Label und TextField
        titlePane.setSpacing(15);
        datePane.setSpacing(15);

        pane.setTop(entryPane);                               //Setzen der HBox in die Mitte des Boarderpanes
        pane.setCenter(checkPane);
        pane.setBottom(buttonPane);

        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setTitle("Tasks");
        stage.setScene(scene);
        stage.show();



    }
}