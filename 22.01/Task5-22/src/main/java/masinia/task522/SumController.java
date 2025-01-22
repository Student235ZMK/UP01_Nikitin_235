package masinia.task522;

import static java.lang.Math.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField numberX;

    @FXML
    private TextField numberY;

    @FXML
    private Label result;

    @FXML
    void BatonOnAction(ActionEvent event) {
        int x = Integer.parseInt(numberX.getText());
        int y = Integer.parseInt(numberY.getText());
        if ((y < 25) && (y > -25) && (x < 50) && (x > -50)) {
            result.setText("да");
        }else if (((abs(y)==25 && abs(x)<=50) || (abs(x)==50 && abs(y)<=25))){
            result.setText("на границе");
        } else {
            result.setText("нет");
        }
    }

}
