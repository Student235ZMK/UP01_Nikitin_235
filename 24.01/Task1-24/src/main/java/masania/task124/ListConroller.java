package masania.task124;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListConroller {

    @FXML
    private Label ResultLabel;

    @FXML
    private ListView<Integer> SetListView;

    @FXML
    private Button dBTN;

    @FXML
    private TextField nTextField;

    @FXML
    void OkOnAction(ActionEvent event) {
        List<Integer> data = SetListView.getItems();
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 10 == 6 && m % 6 == 0) {
                sum += m;
            }
        }
        if (sum > 0)
            ResultLabel.setText(String.valueOf(sum));
        else ResultLabel.setText("Нет чисел оканчивающихся на 6");
    }

    @FXML
    void cancelOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void dOnAction(ActionEvent event) {
        if (nTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(nTextField.getText());
            SetListView.getItems().add(x);
        } catch (NumberFormatException ex){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Данные некоректны");
            alert.showAndWait();
        } finally {
            nTextField.setText("");
        }
    }

}
