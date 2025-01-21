package masinia.task321;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Baton;

    @FXML
    private TextField NumWeek;

    @FXML
    private TextField NumYear;

    @FXML
    void BatonOnAction(ActionEvent event) {
        int K = Integer.parseInt(NumYear.getText());
        int day = 5;
        int Den = (day + (K - 1)) % 7;
        if (Den == 0) {
            Den = 7;
        }
        switch (Den){
            case 1:
                NumWeek.setText("понедельник");
                break;
            case 2:
                NumWeek.setText("вторник");
                break;
            case 3:
                NumWeek.setText("среда");
                break;
            case 4:
                NumWeek.setText("четверг");
                break;
            case 5:
                NumWeek.setText("пятница");
                break;
            case 6:
                NumWeek.setText("суббота ");
                break;
            case 7:
                NumWeek.setText("воскресенье");
                break;
        }
    }

}
