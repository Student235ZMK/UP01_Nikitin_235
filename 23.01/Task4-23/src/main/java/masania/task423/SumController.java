package masania.task423;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    void BatonOnAction(ActionEvent event) {
        int N = Integer.parseInt(number.getText());
        if (N <= 1) {
            result.setText("N должно быть больше 1");
            return;


        }
        int K = 0;
        while (3 * (K + 1) < N) {
            K++;
        }

        result.setText("" + K);
    }
}