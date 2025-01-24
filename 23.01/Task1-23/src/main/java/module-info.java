module com.example.task123 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task123 to javafx.fxml;
    exports com.example.task123;
}