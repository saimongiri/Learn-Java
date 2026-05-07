
import java.util.Scanner;

public class exceptionhandling {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number:");
            int x = s.nextInt();
            System.out.println("Enter another number :");
            int y = s.nextInt();
            int result = x/y;
            System.out.println("Division : "+result);
        } catch (Exception e) {
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
}
