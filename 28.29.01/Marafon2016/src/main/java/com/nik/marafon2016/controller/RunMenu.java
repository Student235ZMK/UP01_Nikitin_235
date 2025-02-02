package com.nik.marafon2016.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import static com.nik.marafon2016.util.General.*;

public class RunMenu {

    @FXML
    private Button BackBTN;

    @FXML
    private Button ContactBTN;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button MySPBTN;

    @FXML
    private Button RedProfBTN;

    @FXML
    private Button RezultBTN;

    @FXML
    private Button registerMainButton;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void ContactBTNOnAction(ActionEvent event) {
        Alert comming =new Alert(Alert.AlertType.CONFIRMATION);
        comming.setHeaderText("Контакты");
        comming.setContentText("Для получения дополнительной информации пожалуйста свяжитесь с координаторами\n" +
                "\n" +
                "Телефон: +55 11 9988 7766\n" +
                "\n" +
                "Email:  coordinators@marathonskills.org\n");
        comming.show();
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void MySPBTNOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("Coming soon");
        coming.setContentText("Данная функция недоступна, но скоро будет добавлена.");
        coming.show();
    }

    @FXML
    void RedProfBTNOnAction(ActionEvent event) {
        Alert comming =new Alert(Alert.AlertType.INFORMATION);
        comming.setHeaderText("Coming soon");
        comming.setContentText("Данная функция недоступна, но скоро будет добавлена.");
        comming.show();
    }

    @FXML
    void RegisterMainOnAction(ActionEvent event) {
        showVznosScene("Vznos.fxml", "Marathon Skills 2016 - Register for as event");
    }

    @FXML
    void RezultBTNOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("Coming soon");
        coming.setContentText("Данная функция недоступна, но скоро будет добавлена.");
        coming.show();
    }

}