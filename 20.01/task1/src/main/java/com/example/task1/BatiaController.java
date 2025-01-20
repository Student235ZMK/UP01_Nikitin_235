package com.example.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BatiaController {

    @FXML
    private Button Baton;

    @FXML
    private Label LabelA;

    @FXML
    private Label LabelB;

    @FXML
    private Label Result;

    @FXML
    private TextField TextFieldA;

    @FXML
    private TextField TextFieldB;

    @FXML
    void BatonOnActoion(ActionEvent event) {
        int a = Integer.parseInt(TextFieldA.getText());
        int b = Integer.parseInt(TextFieldB.getText());
        Result.setText("res = " + Math.sqrt(a * b));
    }

}
