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
        display.setMaxHeight(40);
        display.setMaxWidth(190);

        group.getChildren().add(display);
    }

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

                    CalculatorController calculatorController = new CalculatorController();

                    calculatorController.keyPressed(display, button, e);

                    /*
                     * if (display.getText() != null) {
                     * switch (button.getText()) {
                     * case "0" -> display.setText(display.getText() + "0");
                     * case "1" -> display.setText(display.getText() + "1");
                     * case "2" -> display.setText(display.getText() + "2");
                     * case "3" -> display.setText(display.getText() + "3");
                     * case "4" -> display.setText(display.getText() + "4");
                     * case "5" -> display.setText(display.getText() + "5");
                     * case "6" -> display.setText(display.getText() + "6");
                     * case "7" -> display.setText(display.getText() + "7");
                     * case "8" -> display.setText(display.getText() + "8");
                     * case "9" -> display.setText(display.getText() + "9");
                     * case "+" -> display.setText(display.getText() + "+");
                     * case "-" -> display.setText(display.getText() + "-");
                     * case "*" -> display.setText(display.getText() + "*");
                     * case "/" -> display.setText(display.getText() + "/");
                     * }
                     * }
                     */
                });
                group.getChildren().add(button);
            }
        }
    }

}
