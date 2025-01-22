package masinia.task122;

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
    int num = Integer.parseInt(number.getText());
    int onenumber = num / 100;
    int treenumber = num % 10;
    if (onenumber > treenumber){
        result.setText("Первая цифра больше третьей - " + onenumber);
    } else if (onenumber < treenumber){
        result.setText("Третья цифра больше первой - " + treenumber);
    }
    }

}
