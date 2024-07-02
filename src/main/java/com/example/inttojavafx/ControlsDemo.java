package com.example.inttojavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlsDemo extends Application {
    @Override
    public void start(Stage primarystage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        Label label = new Label("Enter Your Name");
        TextField textField = new TextField();
        Button button= new Button("Say Hello");
        CheckBox checkBox = new CheckBox("I agree To terms and Conditions");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Option1..","Option2..","Option3..");

        button.setOnAction(event -> {
            String name = textField.getText();
            boolean agreed = checkBox.isSelected();
            String option = choiceBox.getValue();
            System.out.println("Hello " + name + "! Agreed: " + agreed + ", Option: " + option);
        });
        root.getChildren().addAll(label,textField,checkBox,choiceBox,button);
        Scene scene = new Scene(root,500,700);
        primarystage.setTitle("Controls Demo");
        primarystage.setScene(scene);
        primarystage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
