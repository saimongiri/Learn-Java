package customexception;

import java.util.Scanner;

public class customexception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       try {
        System.out.println("Enter your age:");
        int age = s.nextInt();
        if (age>=18){
            System.out.println("You are eligible for voting");

        }
        else{
            throw new invalidAge("You are not eligible for voting");
        }   
       } catch (Exception e) {
            System.err.println("Exception : "+e.getMessage());
       } 
    }
}
