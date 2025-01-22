module masinia.task222 {
    requires javafx.controls;
    requires javafx.fxml;


    opens masinia.task222 to javafx.fxml;
    exports masinia.task222;
}