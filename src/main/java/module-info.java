module com.example.pharmacyy {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;


    opens com.example.pharmacyy to javafx.fxml;
    exports com.example.pharmacyy;
}
