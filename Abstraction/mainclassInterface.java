package Abstraction;

public class mainclassInterface {
    public static void main(String[] args) {
        calculateInterface calculator = new calculateInterface();
        int a = 5;
        int b = 10;
        int result = calculator.add(a, b);
        calculator.displayResult(result);
    }
}
