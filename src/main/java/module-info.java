module com.example.inttojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.inttojavafx to javafx.fxml;
    exports com.example.inttojavafx;
}