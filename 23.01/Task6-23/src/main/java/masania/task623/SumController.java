package masania.task623;

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
        boolean seven = false;
        int N = Integer.parseInt(number.getText());
        if (N <= 0) {
            result.setText("N должно быть больше 0");
            return;
        }
        while (N > 0) {
            int digit = N % 10;
            if (digit == 7) {
                seven = true;
                break;
            }
            N /= 10;
        }
    result.setText("" + seven);
    }

}
