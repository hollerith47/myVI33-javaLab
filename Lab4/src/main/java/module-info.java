module com.example.mylab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mylab4 to javafx.fxml;
    exports com.example.mylab4;
}