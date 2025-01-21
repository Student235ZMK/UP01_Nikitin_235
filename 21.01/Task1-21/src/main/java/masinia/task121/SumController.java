package masinia.task121;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Baton;

    @FXML
    private Label FinishNumber;

    @FXML
    private TextField Number;

    @FXML
    void BatonOnAction(ActionEvent event) {
    int num = Integer.parseInt(Number.getText());
    int treeenum = num % 10;
    int twonum = (num / 10) % 10;
    FinishNumber.setText("" + treeenum + "" + twonum);

        }
    }


