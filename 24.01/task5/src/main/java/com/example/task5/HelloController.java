package com.example.task5;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class HelloController {

    @FXML
    private TextField NInput;

    @FXML
    private Label RezultLabel;

    @FXML
    private Button cBTN;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        int n = Integer.parseInt(NInput.getText());
        double a = 1, b = 1;
        double c;
        double res = (double) pow(2, 1) / (1 + pow(a, 2) + pow(b, 2)) * getFactorial(1);
        for (int k = 2; k <= n; k++){
            c = a;
            a = 3 * b + 2 * a;
            b = 2 * c + b;
            res += (double) pow(2, k) / (1 + pow(a, 2) + pow(b, 2)) * getFactorial(k);
        }
        RezultLabel.setText("" + res);
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

    int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
