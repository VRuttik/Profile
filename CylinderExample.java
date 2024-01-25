package com.example.practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.paint.Color;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class CylinderExample extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Cylinder cyn = new Cylinder();
        cyn.setRadius(80);
        cyn.setHeight(200);
        cyn.setTranslateX(300);
        cyn.setTranslateY(250);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(100);
        camera.setTranslateY(100);
        camera.setTranslateZ(0);

        Group group = new Group();
        group.getChildren().addAll(cyn);
        Scene scene = new Scene(group,450,300,Color.LIMEGREEN);
        scene.setCamera(camera);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cylinder Example");
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
