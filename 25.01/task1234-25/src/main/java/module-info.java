module masania.task123425 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens masania.task123425 to javafx.fxml;
    exports masania.task123425;
}