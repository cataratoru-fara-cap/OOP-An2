package com.fxexample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class HelloApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        StackPane stackPane = new StackPane();
        Label text = new Label("Hello, JavaFX!");
        stackPane.getChildren().add(text);

        Scene scene = new Scene(stackPane, 640, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}