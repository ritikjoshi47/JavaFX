package be.kdg.progpat.week2.m2.testapp.view;

import javafx.geometry.Insets;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class MenuBarView extends BorderPane {
    private MenuItem exit;
    private MenuItem export;
    private MenuItem about;

    public MenuBarView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        exit = new MenuItem("Exit");
        export = new MenuItem("export");
        about = new MenuItem("About");
    }

    private void layoutNodes() {
        final Menu fileMenu = new Menu("File", null, exit,export);
        final Menu aboutMenu = new Menu("About",null, about);
        final MenuBar menuBar = new MenuBar(fileMenu, aboutMenu);
        setTop(menuBar);
        BorderPane.setMargin(menuBar, new Insets(0.0, 0.0, 100.0, 0.0));
    }
}

