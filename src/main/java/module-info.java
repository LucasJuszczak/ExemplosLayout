module com.example.exemploslayout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemploslayout to javafx.fxml;
    exports com.example.exemploslayout;
}