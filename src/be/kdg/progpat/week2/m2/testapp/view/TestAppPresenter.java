package be.kdg.progpat.week2.m2.testapp.view;

import be.kdg.progpat.week2.m2.testapp.model.TestAppModel;

public class TestAppPresenter {
    private TestAppModel model;
    private MenuBarView view;

    public TestAppPresenter(TestAppModel model, MenuBarView view) {
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