package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;

public class CheckBoxView extends BorderPane {
    private CheckBox agree;

    public CheckBoxView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        agree = new CheckBox("I agree " + "to the terms & conditions.");
    }

    private void layoutNodes() {
        setCenter(agree);
        BorderPane.setMargin(agree, new Insets(15.0));
    }
}

