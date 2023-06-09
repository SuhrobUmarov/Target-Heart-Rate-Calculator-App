package com.example.targetheartratecalculatorapp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TargetHeartMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TheartRate.fxml"));
        primaryStage.setTitle("Target Heart Calculator");
        primaryStage.setScene(new Scene(root,331, 181));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}