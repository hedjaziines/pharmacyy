module com.example.pharmacyy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pharmacyy to javafx.fxml;
    exports com.example.pharmacyy;
}