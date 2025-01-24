package masania.task523;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Label minK;

    @FXML
    private TextField number;

    @FXML
    private Label summ;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int N = Integer.parseInt(number.getText());
        if (N <= 1) {
            summ.setText("N должно быть больше 1");
            minK.setText("N должно быть больше 1");
            return;
        }
        int K = 0;
        int sum = 0;
        while (sum < N) {
            K++; //
            sum += K;
        }
        summ.setText("" + sum);
        minK.setText("" + K);
    }

}
