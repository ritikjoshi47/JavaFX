package be.kdg.progpat.background;

import be.kdg.progpat.background.model.Background;
import be.kdg.progpat.background.view.BackgroundPresenter;
import be.kdg.progpat.background.view.BackgroundView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Background model = new Background();
        BackgroundView view = new BackgroundView();
        primaryStage.setScene(new Scene(view));
        new BackgroundPresenter(model, view);
        primaryStage.show();
    }
}


