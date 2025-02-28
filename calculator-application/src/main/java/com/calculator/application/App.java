package com.calculator.application;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        ViewCalculator calculatorView = new ViewCalculator();
        calculatorView.calculatorDisplay(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}