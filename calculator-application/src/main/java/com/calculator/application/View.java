package com.calculator.application;

import java.io.File;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class View {

    private Image calculatorIcon;

    public void calculatorDisplay(@SuppressWarnings("exports") Stage stage) {
        File iconFile = new File("calculator-application\\src\\main\\resources\\images\\calculatorIcon.png");

        /*
         * if (iconFile.exists()) {
         * System.out.println("Existe");
         * System.exit(0);
         * } else {
         * System.out.println("No existe");
         * System.exit(0);
         * }
         */

        calculatorIcon = new Image(iconFile.toURI().toString());

        stage.setTitle("Calculator");
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.setX(240);
        stage.setY(540);
        stage.setHeight(500);
        stage.setWidth(400);

        stage.getIcons().add(calculatorIcon);
        stage.show();
    }
}
