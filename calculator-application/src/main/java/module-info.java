module com.calculator.application {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.calculator.application to javafx.fxml;
    exports com.calculator.application;
}
