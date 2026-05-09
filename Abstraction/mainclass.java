package abstraction;

public class MainClass {

    public static void main(String[] args) {

        Calculate c = new Calculate();

        c.setA(5);
        c.setB(10);

        c.display();

        int sum = c.add();

        System.out.println("The sum is: " + sum);
    }
}