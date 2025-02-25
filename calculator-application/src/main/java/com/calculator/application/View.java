package com.calculator.application;

import java.io.File;

import javafx.scene.image.Image;
import javafx.stage.Stage;

public class View {
    
      private Image calculatorIcon;

    public void calculatorDisplay(@SuppressWarnings("exports") Stage stage) {
        File iconFile = new File("src/main/resources/Images/calculatorIcon.png");

        calculatorIcon = new Image(iconFile.getAbsolutePath());

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
