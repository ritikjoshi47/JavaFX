package be.kdg.progpat.background.view;

import be.kdg.progpat.background.model.Background;

public class BackgroundPresenter {
    private Background model;
    private BackgroundView view;

    public BackgroundPresenter(Background model, BackgroundView view) {
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
    }

    private void updateView() {
        // fills the view with model data
    }
}