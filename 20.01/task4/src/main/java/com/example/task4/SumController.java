package com.example.task4;

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
    private TextField Znach1;

    @FXML
    private TextField Znach2;

    @FXML
    void BatonOnAction(ActionEvent event) {
        double J = Double.parseDouble(Znach2.getText());
        double λ = Double.parseDouble(Znach2.getText());
        double L = 1 + 24.86 * Math.pow(10, -2);
        double Jλ = J * λ;
        double D = (L + Math.sin(Jλ) / 2 + Math.cos(Math.pow(λ, 2)) + λ - Math.pow(10, λ));
        Result.setText("D =" + D);
    }

}
