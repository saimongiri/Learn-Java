package Inheritance.single;

public class dog extends animal {
    void bark(){
        System.out.println("barking...");
    }
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
    
}
