package be.kdg.progpat.m1;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HelloJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        Label helloLabel = new Label("Hello JavaFX!");
//        BorderPane root = new BorderPane(helloLabel);
        Group root = new Group();
        Scene scene = new Scene(root,50,600);

        scene.setFill(Color.YELLOW);
        scene.setCursor(Cursor.CROSSHAIR);


        Scene scene1 = new Scene(new Group(), 900, 800);
        scene1.setCursor(Cursor.HAND);
        scene1.setFill(Color.RED);
        Stage secondStage = new Stage();
        secondStage.setTitle("2nd Stage");
        secondStage.setScene(scene1);
        secondStage.show();
        primaryStage.setResizable(true);

        primaryStage.setMaxWidth(700);
        primaryStage.setTitle("Hey! This is the title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
