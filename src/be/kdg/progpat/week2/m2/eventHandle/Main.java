package be.kdg.progpat.week2.m2.eventHandle;

import be.kdg.progpat.week2.m2.eventHandle.model.EventHandleModel;
import be.kdg.progpat.week2.m2.eventHandle.view.EventHandlePresenter;
import be.kdg.progpat.week2.m2.eventHandle.view.EventHandleView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        EventHandleModel model = new EventHandleModel();
        EventHandleView view = new EventHandleView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Background");
        new EventHandlePresenter(model, view);
        primaryStage.show();
    }
}

