module masinia.task321 {
    requires javafx.controls;
    requires javafx.fxml;


    opens masinia.task321 to javafx.fxml;
    exports masinia.task321;
}