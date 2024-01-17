package com.example.practice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleRectangle extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Simple Rectangle");

        Group group = new Group();
        Rectangle rect = new Rectangle();

        rect.setX(20);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(100);

        group.getChildren().add(rect);

        Scene scene = new Scene(group, 200, 300, Color.YELLOW);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
