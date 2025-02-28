package com.calculator.application;

public class Calculator {

    private double number;

    public Calculator(){
        setNumber(0);
    } 

    public double adding(double numberAdding){
        return number + numberAdding;
    }

    public double subtract(double numberSubtracting){
        return number - numberSubtracting;
    }

    public double multiply(double numberMultiply){
        return number * numberMultiply;
    }

    public double divide(double numberDividing){
        if (numberDividing != 0) return number / numberDividing;
        else return 0;
    }



    public double getNumber() {
        return number;
    }



    public void setNumber(double number) {
        this.number = number;
    }

    

}
