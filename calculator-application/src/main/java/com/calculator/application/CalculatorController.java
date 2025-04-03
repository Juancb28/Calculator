package com.calculator.application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class CalculatorController {

    Calculator calculator = new Calculator();

    @SuppressWarnings("exports")
    public void keyPressed(Label display, Button button, MouseEvent e) {
        if (isNumber(button))
            System.out.println("Test " + button.getText() + " was pressed.");
        else
            System.out.println("Operator was pressed " + button.getText());
    }

    private void keyPressedNumbers(Label display) {

    }

    private void keyPressedOperators() {

    }

    private boolean isNumber(Button button) {
        Pattern numbersPattern = Pattern.compile("[0-9]");
        Matcher mat = numbersPattern.matcher(button.getText());
        return mat.find();
    }

}
