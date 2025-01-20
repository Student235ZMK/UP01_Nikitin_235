package ru.nikitin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewController {

    @FXML
    private Button Baton;

    @FXML
    private Label Perimetr;

    @FXML
    private Label Ploshad;

    @FXML
    private TextField TextX1;

    @FXML
    private TextField TextX2;

    @FXML
    private TextField TextX3;

    @FXML
    private TextField TextY1;

    @FXML
    private TextField TextY2;

    @FXML
    private TextField TextY3;

    @FXML
    void BatonOnAction(ActionEvent event) {
    double x1 = Double.parseDouble(TextX1.getText());
    double x2 = Double.parseDouble(TextX2.getText());
    double x3 = Double.parseDouble(TextX3.getText());
    double y1 = Double.parseDouble(TextY1.getText());
    double y2 = Double.parseDouble(TextY2.getText());
    double y3 = Double.parseDouble(TextY3.getText());
    double a = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    double c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    Perimetr.setText("Периметр "+(a + b + c));
    double p = (a + b + c) / 2f;
    Ploshad.setText("Площадь = " + Math.sqrt(p * (p-a) * (p-b) * (c - p)));
    
    }

}
