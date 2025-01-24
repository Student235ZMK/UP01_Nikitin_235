package com.example.task123;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField Comanda;

    @FXML
    private TextField Napravlenie;

    @FXML
    private Label result;

    @FXML
    void BatonOnAction(ActionEvent event) {
        String naprav = Napravlenie.getText();
        int commanda = Integer.parseInt(Comanda.getText());
        String newnaprav = naprav;
                switch (newnaprav) {
                    case "С":
                        if (commanda == 1) {
                            newnaprav = String.valueOf('З');
                        } else if (commanda == -1) {
                            newnaprav = String.valueOf('В');
                        }
                        break;
                    case "З":
                        if (commanda == 1) {
                            newnaprav = String.valueOf('Ю');
                        } else if (commanda == -1) {
                            newnaprav = String.valueOf('С');
                        }
                        break;
                    case "Ю":
                        if (commanda == 1) {
                            newnaprav = String.valueOf('В');
                        } else if (commanda == -1) {
                            newnaprav = String.valueOf('З');
                        }
                        break;
                    case "В":
                        if (commanda == 1) {
                            newnaprav = String.valueOf('С');
                        } else if (commanda == -1) {
                            newnaprav = String.valueOf('Ю');
                        }
                        break;
                    default:
                        result.setText("Данные некоректны");
                        return;
                }
        if (commanda == 0) {
            newnaprav = naprav;
        }
        result.setText("" + newnaprav);
    }

}


