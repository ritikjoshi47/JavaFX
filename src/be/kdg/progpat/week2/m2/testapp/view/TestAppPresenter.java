package be.kdg.progpat.week2.m2.testapp.view;

import be.kdg.progpat.week2.m2.testapp.model.TestAppModel;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

import java.util.Optional;

import static javafx.scene.control.Alert.AlertType.CONFIRMATION;

public class TestAppPresenter {
    private TestAppModel model;
    private QuizView view;

    public TestAppPresenter(TestAppModel model, QuizView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        // Add event handlers (inner classes or
        // lambdas) to view controls.
        // In the event handlers: call model methods
        // and updateView().
        view.getScene().getWindow().setOnCloseRequest(new ConfirmCloseHandler());
    }

    private void updateView() {
        // fills the view with model data
    }
    private class ConfirmCloseHandler implements EventHandler<WindowEvent> {
        @Override
        public void handle(WindowEvent event) {
            final Alert sure = new Alert(CONFIRMATION,
                    "Are you sure you want to exit?");
            sure.setHeaderText("Are you sure?");
            Optional<ButtonType> choice = sure.showAndWait();
            if (choice.isPresent() &&
                    choice.get().getText().equalsIgnoreCase("CANCEL")) {
                event.consume();
            }
        }
    }
}