package masania.task324;

import javafx.application.Platform;
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
    void offOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void okOnAction(ActionEvent event) {
        int N = Integer.parseInt(number.getText());
        if (N > 0) {
            int sum = 0;
            for (int i = N; i <= 2 * N; i++) {
                sum += i * i;
            }
            result.setText(String.valueOf(sum));
        } else {
            result.setText("Введите число больше 0");
        }

    }
}