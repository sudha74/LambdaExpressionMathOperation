package com.bridgelabz;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);

    static void displayResult(int a, int b, String functionality, IMathFunction ref) {
        System.out.println(functionality + " of " + a + " and " + b + " => " + ref.calculate(a, b));
    }
}

public class MainClass {
    public static void main(String[] args) {
        IMathFunction sum = (a, b) -> a + b;
        IMathFunction prod = (a, b) -> a * b;
        IMathFunction divide = (a, b) -> a / b;

        IMathFunction.displayResult(5, 8, "SUM", sum);
        IMathFunction.displayResult(2, 4, "PRODUCT", prod);
        IMathFunction.displayResult(10, 5, "DIVISION", divide);
    }
}
