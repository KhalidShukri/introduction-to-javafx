package com.example.inttojavafx;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class SceneGraphExample extends Application {
    @Override
    public void start(Stage primarystage) throws Exception {
//        Root Node
        VBox root = new VBox(10);
//        Child Nodes
        Label label = new Label("Welcome To JavaFX!");
        Button button = new Button("Click Me");

//        Add children to the roots node
        root.getChildren().addAll(label,button);
        Scene scene = new Scene(root,300,200);
//        Set up the Stage
        primarystage.setTitle("Scene Graph Example");
        primarystage.setScene(scene);
        primarystage.show();
//        Demonstrate Traversing the Scene Graph
        button.setOnAction(event -> {
            traverseSceneGraph(root,0);
        });

    }
    public void traverseSceneGraph(javafx.scene.Node node,int level){
//        Print current node with indentation
        System.out.println("  ".repeat(level) + node.getClass().getSimpleName());
//        if the node is parent,traverse its children
        if(node instanceof javafx.scene.Parent){
            for(javafx.scene.Node child : ((javafx.scene.Parent)node).getChildrenUnmodifiable()){
                traverseSceneGraph(child,level = 1);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
