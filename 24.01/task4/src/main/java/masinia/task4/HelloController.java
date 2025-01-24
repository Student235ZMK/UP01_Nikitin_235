package masinia.task4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField namberN;

    @FXML
    private TextField numberA;

    @FXML
    private Label result;

    @FXML
    void CancelOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void OkOnAction(ActionEvent event) {
    int A = Integer.parseInt(numberA.getText());
    int N = Integer.parseInt(namberN.getText());
        if (N <= 0) {
            result.setText("N должно быть больше 0");
            return;
        }
    double sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += Math.pow(A, i);
        }
    result.setText("" + sum);
    }

}
