module com.calculator.application {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.calculator.application to javafx.fxml;
    exports com.calculator.application;
}
