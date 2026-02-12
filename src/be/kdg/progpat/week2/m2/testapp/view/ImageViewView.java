package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ImageViewView extends BorderPane {
    private ImageView imageView;

  public ImageViewView() {
      initialiseNodes();
      layoutNodes();
  }

    private void initialiseNodes() {
      imageView = new ImageView(new Image("/angrybird.png"));
  }

    private void layoutNodes() {
      setCenter(imageView);
      BorderPane.setMargin(imageView, new Insets(10));
  }
}

