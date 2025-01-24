package masania.task323;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NumD;

    @FXML
    private TextField NumS;

    @FXML
    private TextField elem;

    @FXML
    private TextField numL;

    @FXML
    private TextField numR;

    @FXML
    private TextField znach;

    @FXML
    void BatonOnAction(ActionEvent event) {
        int znachenie = Integer.parseInt(znach.getText());
        int element = Integer.parseInt(elem.getText());
        double R, D, L, S;
        final double PI = 3.14;
        switch (element) {
            case 1:
                R = znachenie;
                D = 2 * R;
                L = 2 * PI * R;
                S = PI * R * R;
                break;
            case 2:
                D = znachenie;
                R = D / 2;
                L = 2 * PI * R;
                S = PI * R * R;
                break;
            case 3:
                L = znachenie;
                R = L / (2 * PI);
                D = 2 * R;
                S = PI * R * R;
                break;
            case 4:
                S = znachenie;
                R = Math.sqrt(S / PI);
                D = 2 * R;
                L = 2 * PI * R;
                break;
            default:
                elem.setText("Неверный элеменет");
                return;
        }
        numR.setText("Радиус " + R);
        NumD.setText("Диаметр " + D);
        numL.setText("Длина " + L);
        NumS.setText("Площадь " + S);

    }

}
