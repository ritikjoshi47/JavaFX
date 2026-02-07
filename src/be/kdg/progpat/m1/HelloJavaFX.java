package be.kdg.progpat.m1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HelloJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label helloLabel = new Label("Hello JavaFX!");
        BorderPane root = new BorderPane(helloLabel);
        Scene scene = new Scene(root);
        primaryStage.setWidth(500);
        primaryStage.setHeight(600);
        primaryStage.setResizable(true);
        primaryStage.setTitle("Hey! This is the title");
        primaryStage.setMaxWidth(700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
