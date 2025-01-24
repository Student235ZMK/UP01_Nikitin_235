module masinia.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens masinia.task4 to javafx.fxml;
    exports masinia.task4;
}