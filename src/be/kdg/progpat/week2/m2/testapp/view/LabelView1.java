package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class LabelView1 extends BorderPane {
    private Label label;

    public LabelView1() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        Image imageOk = new Image("/angrybird.png");
        label = new Label("Accept", new ImageView(imageOk));
    }

    private void layoutNodes() {
        setCenter(label);
        BorderPane.setMargin(label, new Insets(10));
    }
}

