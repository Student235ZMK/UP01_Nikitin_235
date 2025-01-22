package masinia.task322;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField numberA;

    @FXML
    private TextField numberB;

    @FXML
    private TextField numberC;

    @FXML
    private Label resultA;

    @FXML
    private Label resultB;

    @FXML
    private Label resultC;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int A = Integer.parseInt(numberA.getText());
    int B = Integer.parseInt(numberB.getText());
    int C = Integer.parseInt(numberC.getText());
    boolean vlad =  (A < B && B < C);
    boolean artem = (A > B && B > C);
    if (vlad || artem){
        A *= 2;
        B *= 2;
        C *= 2;
    } else {
        A = -A;
        B = -B;
        C = -C;
    }
    resultA.setText("A = " + A);
    resultB.setText("B = " + B);
    resultC.setText("C = " + C);
    }

}
