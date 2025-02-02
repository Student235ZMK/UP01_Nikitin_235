package com.nik.marafon2016.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static com.nik.marafon2016.util.General.*;

public class EndController {

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button thxOkButton;

    @FXML
    void BackOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void thxOkOnAction(ActionEvent event) {
        showRunMenuScene("RannerMenu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}