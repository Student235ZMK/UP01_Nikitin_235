package masinia.task222;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label ResultA;

    @FXML
    private Label ResultB;

    @FXML
    private TextField numberB;

    @FXML
    private TextField numderA;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int A = Integer.parseInt(numderA.getText());
    int B = Integer.parseInt(numberB.getText());
    if (A != B) {
        A = A + B;
        B = A;
    } else {
        A = 0;
        B = 0;
    }
    ResultA.setText("A = " + A);
    ResultB.setText("B = " + B);
    }


}
