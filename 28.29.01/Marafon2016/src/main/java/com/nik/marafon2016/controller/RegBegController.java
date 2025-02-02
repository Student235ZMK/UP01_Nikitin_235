package com.nik.marafon2016.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.nik.marafon2016.util.General.*;

public class RegBegController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button LoninBTN;

    @FXML
    private Button iNewBegunBTN;

    @FXML
    private Button iamBegunBTN;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LoginBTNOnAction(ActionEvent event) {
        showloginScene("Login.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void iNewBegunBTNOnAction(ActionEvent event) {
        showRegScene("Reg.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void iamBegunBTNOnAction(ActionEvent event) {
        showloginScene("Login.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}