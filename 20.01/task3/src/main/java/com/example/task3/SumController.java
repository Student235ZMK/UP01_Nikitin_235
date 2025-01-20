package com.example.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Baton;

    @FXML
    private Label Result;

    @FXML
    private TextField TextR;

    @FXML
    void BatonOnAction(ActionEvent event) {
        int a = Integer.parseInt(TextR.getText());
        if (0 <= a) {
            if (a < 2 * Math.PI) {
                Result.setText("a = " + a * (180 / 3.14f));
            } else {
                Result.setText("Данные не коректны");
            }
        }

    }
}