package com.nik.marafon2016.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static com.nik.marafon2016.util.General.*;

public class LoginController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button CancelBTN;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button LoginBTN;

    @FXML
    private TextField PasswordTextField;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void CancelBTNOnAction(ActionEvent event) {
        showregberScene("regbeg.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LoginBTNOnAction(ActionEvent event) {
        showRunMenuScene("RannerMenu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
