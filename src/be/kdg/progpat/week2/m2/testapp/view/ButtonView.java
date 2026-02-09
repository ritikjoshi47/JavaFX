package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ButtonView extends BorderPane {
    private Button button1, button2, button3;

public ButtonView() {
    initialiseNodes();  layoutNodes();
}

private void initialiseNodes() {
    button1 = new Button();
    button2 = new Button("Accept");
    Image imageOk = new Image("/angrybird.png");
    button3 = new Button("Accept", new ImageView(imageOk));
}

  private void layoutNodes() {
    setTop(button1);
        setCenter(button2);
        setBottom(button3);
        BorderPane.setMargin(button1, new Insets(10));
        BorderPane.setMargin(button2, new Insets(10));
        BorderPane.setMargin(button3, new Insets(10));
        BorderPane.setAlignment(button2, Pos.CENTER_RIGHT);
    }
}

