package com.calculator.application;

import java.io.File;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ViewCalculator {

    private Image calculatorIcon;
    private Label display;
    private Calculator calculator;

    public void calculatorDisplay(@SuppressWarnings("exports") Stage stage) {
        File iconFile = new File("calculator-application\\src\\main\\resources\\images\\calculatorIcon.png");
        Group group = new Group();
        Scene scene = new Scene(group);

        calculatorIcon = new Image(iconFile.toURI().toString());

        stage.setTitle("Calculator");
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.setX(235);
        stage.setY(540);
        stage.setHeight(350);
        stage.setWidth(250);
        stage.getIcons().add(calculatorIcon);

        stage.setScene(scene);

        numberDisplay(group);
        buttonsCalculator(group);

        stage.show();
    }

    private void numberDisplay(Group group) {
        display = new Label();
        display.setLayoutX(20);
        display.setLayoutY(10);
        display.setMinHeight(30);
        display.setMinWidth(190);
        display.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");

        group.getChildren().add(display);
    }

    @SuppressWarnings("unlikely-arg-type")
    private void buttonsCalculator(Group group) {
        String[][] buttonLabels = {
                { "7", "8", "9", "/" },
                { "4", "5", "6", "*" },
                { "1", "2", "3", "-" },
                { "0", "C", "=", "+" }
        };

        for (int i = 0; i < buttonLabels.length; i++) {
            for (int j = 0; j < buttonLabels[i].length; j++) {
                Button button = new Button(buttonLabels[i][j]);
                button.setLayoutX(20 + j * 50);
                button.setLayoutY(100 + i * 50);
                button.setMinSize(40, 40);
                button.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
                button.setOnMouseClicked(e -> {
                    if (e.getEventType().equals(true))
                        display.setText(button.getText() + " clicked");

                    
                    //TODO Change this logic into CalculatorController 
                    switch (button.getText()) {
                        case "+" -> calculator.adding(Double.parseDouble(display.getText()));
                        case "-" -> calculator.subtract(Double.parseDouble(display.getText()));
                        case "*" -> calculator.multiply(Double.parseDouble(display.getText()));
                        case "/" -> calculator.divide(Double.parseDouble(display.getText()));
                    }
                });
                group.getChildren().add(button);
            }
        }
    }
}
