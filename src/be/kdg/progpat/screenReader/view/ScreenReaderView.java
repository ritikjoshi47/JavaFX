package be.kdg.progpat.screenReader.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ScreenReaderView extends BorderPane {

    private Button readButton;
    private TextArea textArea;
    public ScreenReaderView() {
        initializeNodes();
        layoutNodes();
    }
    private void initializeNodes() {
        this.readButton = new Button("Read aloud");
        this.textArea = new TextArea("blah blah");
    }
    private void layoutNodes() {
        this.setCenter(textArea);
        this.setBottom(readButton);
        BorderPane.setAlignment(readButton, Pos.CENTER);
        BorderPane.setMargin(readButton, new Insets(10));
    }

    TextArea getTextArea(){
        return textArea;
    }

    Button getReadButton(){
        return readButton;
    }
}

