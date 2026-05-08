package classExample;

public class constructor {
    private String name;
    private int age;

    // Constructor
    public constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        constructor person = new constructor("Saimon", 19);
        person.displayInfo();
    }
}
