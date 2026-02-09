package be.kdg.progpat.week2.m2.eventHandle.view;

import be.kdg.progpat.week2.m2.eventHandle.model.EventHandleModel;

public class EventHandlePresenter {
    private EventHandleModel model;
    private EventHandleView view;

    public EventHandlePresenter(EventHandleModel model, EventHandleView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getToggleButton().setOnAction(
                event -> {
                    System.out.println(
                            view.getToggleButton().isSelected() ? "On" : "Off");

        // Add event handlers (inner classes or
        // lambdas) to view controls.
        // In the event handlers: call model methods
        // and updateView().
    });}

private void updateView() {
        // fills the view with model data
    }
}
