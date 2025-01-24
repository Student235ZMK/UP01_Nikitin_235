package masania.task223;

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
        int age = Integer.parseInt(number.getText());
        int tens = age / 10;
        int units = age % 10;
        String res = " ";
        switch (tens) {
            case 2:
                res = "Двадцать ";
                break;
            case 3:
                res = "Тридцать ";
                break;
            case 4:
                res = "Сорок ";
                break;
            case 5:
                res = "Пятьдесят ";
                break;
            case 6:
                res = "Шестьдесят ";
                break;
        }
        if (units == 0) {
            res = res + "лет";
        } else
            switch (units) {
                case 1:
                    res = res + "один год";
                    break;
                case 2:
                    res = res + "два года";
                    break;
                case 3:
                    res = res + "три года";
                    break;
                case 4:
                    res = res + "четыре года";
                    break;
                case 5:
                    res = res + "пять лет";
                    break;
                case 6:
                    res = res + "шесть лет";
                    break;
                case 7:
                    res = res + "семь лет";
                    break;
                case 8:
                    res = res + "восемь лет";
                    break;
                case 9:
                    res = res + "девять лет";
                    break;
            }
        result.setText(res);
    }

}
