package abstraction;

public class Calculate extends Adderclass {

    @Override
    public int add() {
        return getA() + getB();
    }

    // Optional display method
    public void display() {
        System.out.println("A = " + getA());
        System.out.println("B = " + getB());
    }
}