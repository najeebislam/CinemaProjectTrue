package com.example.cinemaprojecttrue;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    Button Register,Return,Login,ReturnToOptions;


    public void handleRegister() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registerscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Register.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }


    public void handleLogin() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Login.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }



    public void handleReturn() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("openscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) Return.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }



    public void handleReturnToOptions() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("openscreen.fxml"));
            //root = FXMLLoader.load(getClass().getResource("registerscreen.fxml"));

            Stage window = (Stage) ReturnToOptions.getScene().getWindow();
            window.setScene(new Scene(fxmlLoader.load(), 600, 450));
        }catch (Exception e) {
            System.out.println(e);
        }


    }


}