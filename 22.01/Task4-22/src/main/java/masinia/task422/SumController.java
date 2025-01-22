package masinia.task422;

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
    private TextField numberX;

    @FXML
    private Label result;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int a = Integer.parseInt(numberA.getText());
    int b = Integer.parseInt(numberB.getText());
    int x = Integer.parseInt(numberX.getText());
    double y;
        if (x > Math.PI) {
            y = 1 - Math.exp(-a * x) * Math.sin(a * x + b);
        } else if (x >= -Math.PI && x <= Math.PI) {
            y = 1 - Math.exp(-a * x) * (a * x + b);
        } else {
            y = 1 - (Math.exp(-a * x) + Math.exp(-b * x));
        }
        result.setText("y = " + y);

    }


}
