module ru.nikitin.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nikitin.task2 to javafx.fxml;
    exports ru.nikitin.task2;
}