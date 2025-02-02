module com.nik.marafon2016 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nik.marafon2016 to javafx.fxml;
    exports com.nik.marafon2016;
    exports com.nik.marafon2016.controller;
    opens com.nik.marafon2016.controller to javafx.fxml;
}