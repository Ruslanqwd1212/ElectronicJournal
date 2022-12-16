module com.example.electronicjournal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronicjournal to javafx.fxml;
    exports com.example.electronicjournal;
}