module masinia.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens masinia.task3 to javafx.fxml;
    exports masinia.task3;
}