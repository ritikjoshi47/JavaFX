package be.kdg.progpat.week2.m2.testapp;

import be.kdg.progpat.week2.m2.testapp.model.TestAppModel;
import be.kdg.progpat.week2.m2.testapp.view.QuizView;
import be.kdg.progpat.week2.m2.testapp.view.TestAppPresenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        TestAppModel model = new TestAppModel();
        QuizView view = new QuizView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Background");
        new TestAppPresenter(model, view);
        primaryStage.show();
    }
}


