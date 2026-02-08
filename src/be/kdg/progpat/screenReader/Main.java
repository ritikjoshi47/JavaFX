package be.kdg.progpat.screenReader;

import be.kdg.progpat.screenReader.model.ScreenReader;
import be.kdg.progpat.screenReader.view.ScreenReaderPresenter;
import be.kdg.progpat.screenReader.view.ScreenReaderView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ScreenReader model = new ScreenReader();
        model.setText("What can I say?");
        ScreenReaderView view = new ScreenReaderView();
        primaryStage.setTitle("Screen Reader");
        primaryStage.setWidth(300);
        primaryStage.setHeight(450);
        primaryStage.setScene(new Scene(view));
        new ScreenReaderPresenter(model, view);
        primaryStage.show();
    }
}
