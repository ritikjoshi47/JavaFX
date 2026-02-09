package be.kdg.progpat.week2.m2.eventHandle.view;

import javafx.geometry.Insets;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;

public class EventHandleView extends BorderPane {
    private ToggleButton toggleButton;

    public EventHandleView () {
        this.initialiseNodes();
        this.layoutNodes();
    }
    private void initialiseNodes() {
        toggleButton = new ToggleButton("On/Off");
        toggleButton.setSelected(true);
    }

    private void layoutNodes() {
        this.setTop(toggleButton);
        BorderPane.setMargin(toggleButton,
                new Insets(30.0));
    }

    ToggleButton getToggleButton () {
        return toggleButton;
    }

}
