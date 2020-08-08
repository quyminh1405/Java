package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LambdaEventHandler extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Button btn = new Button();
        btn.setText("Press here");

        /*The code will look like this without Lambda expression*/
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Hello mfs");
//            }
//        });

        /*The Lambda Expression*/
        //because EventHandler is a functional interface, so the only requirement here is to parse an actionEvent object
        btn.setOnAction(actionEvent -> System.out.println("Hello MFs"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
