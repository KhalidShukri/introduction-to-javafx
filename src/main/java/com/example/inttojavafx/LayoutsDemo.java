package com.example.inttojavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutsDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root =new BorderPane();
//        top:HBox
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10));
        hBox.getChildren().addAll(new Button("Button1",new Button("Button 2")));
        root.setTop(hBox);

//        left:VBox
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(new Button("Button 3"),new Button("Button 4"));
        root.setLeft(vBox);

//        Centre:GridPane
        GridPane gridPane = new GridPane();

        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(new Button("Button 5"),0,0);
        gridPane.add(new Button("Button 6"),1,0);
        gridPane.add(new Button("Button 7"),0,1);
        gridPane.add(new Button("Button 8"),1,1);
        root.setCenter(gridPane);

        Scene scene = new Scene(root,500,700);
        stage.setTitle("Layouts Demo");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
