
import java.util.Scanner;

public class onedarray {
    public static void main(String[] args) {
        int i;
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array element:");
        for(i=0;i<10;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Array elements are : ");
        for(i=0;i<10;i++){
            System.out.println("arr["+i+"]:"+arr[i]);
        }
    }
    
}
