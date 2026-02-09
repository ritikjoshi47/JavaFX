package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class LabelView2 extends BorderPane {
    private Label label;
    public LabelView2() {
        initialiseNodes();
        layoutNodes();
    }
private void initialiseNodes() {
        label = new Label("Accept");
    }
 private void layoutNodes() {
        label.setBackground(new Background(new BackgroundFill(Color.ORANGE,
                            CornerRadii.EMPTY, Insets.EMPTY)));
        label.setBorder(new Border(new BorderStroke(Color.RED,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(3))));
        label.setPrefSize(100, 50);
        label.setAlignment(Pos.CENTER);
        setCenter(label);
        BorderPane.setMargin(label, new Insets(10));
    }
}
