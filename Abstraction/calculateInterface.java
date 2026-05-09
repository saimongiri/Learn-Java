package Abstraction;

public class calculateInterface implements abstractionInterface {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void displayResult(int result) {
        System.out.println("The result of addition is: " + result);
    }
    
}
