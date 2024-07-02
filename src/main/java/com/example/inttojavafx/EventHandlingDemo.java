package com.example.inttojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class EventHandlingDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox(10);
        Label label = new Label("Hover and Click Me!");
        label.setOnMouseEntered(this::handleMouseEntered);
        label.setOnMouseExited(this::handleMouseExited);
        label.setOnMouseClicked(this::handleMouseClicked);

        root.getChildren().add(label);
        Scene scene = new Scene(root,400,600);
        stage.setTitle("Event Handling Demo");
        stage.setScene(scene);
        stage.show();

    }
    private void handleMouseEntered(MouseEvent event){
        Label source = (Label) event.getSource();
        source.setStyle("-fx-background-color: yellow");

    }
    private void handleMouseExited(MouseEvent event){
        Label source = (Label) event.getSource();
        source.setStyle("");

    }
    private void handleMouseClicked(MouseEvent event){
        Label source = (Label) event.getSource();
        source.setText("Clicked! Click Count: " + event.getClickCount());

    }


    public static void main(String[] args) {
        launch(args);
    }
}
