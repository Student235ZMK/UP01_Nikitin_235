package masinia.task221;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Baton;

    @FXML
    private TextField number;

    @FXML
    private Label result;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int num = Integer.parseInt(number.getText());
    if (num > 999) {
        int resultnum = (num / 100) % 10;
        result.setText("" + resultnum);
    }else {
        result.setText("данные не коректны ");

        }
    }


}
