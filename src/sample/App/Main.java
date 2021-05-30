package sample.App;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Controller.Controller;
import sample.Model.Model;
import sample.View.View;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
