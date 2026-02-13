package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class QuizView extends VBox {
    public QuizView() {
        TextField name = new TextField();
        Label label = new Label();
        name.setOnKeyTyped(
        event -> label.setText(event.getCharacter()
                + label.getText())
        );
        setSpacing(10);
        setPadding(new Insets(10));
        getChildren().addAll(label, name);
    }
}

