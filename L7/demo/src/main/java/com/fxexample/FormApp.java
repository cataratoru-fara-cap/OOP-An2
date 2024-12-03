package com.fxexample;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FormApp extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 640, 480);
        stage.setTitle("Form");
        stage.setScene(scene);
        stage.show();

        grid.setAlignmemt(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);

        grid.setPadding(new Insets(25, 25, 25, 25));

        Text title = new Text("Form");
        grid.add(title, 0, 0, 2, 1);
        Label email = new Label("email:");
        grid.add(email, 0, 1);        
        TextField emailTextField = new TextField();
        grid.add(emailTextField, 1, 1);
        Label password = new Label("password:");
        grid.add(password, 0, 2);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 1, 1, 1);
        Button submit = new Button("Submit");
        grid.add(submit, 1, 2, 1, 1);
        
    }

    public static void main(String[] args) {
        launch();
    }
}
