package com.kodilla.calculator;

public class Calculator{
    int a = 7;
    int b = 8;
    public int sum(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.sub();

        System.out.println(calculator.sum());
    }
}


