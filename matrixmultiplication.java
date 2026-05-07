
import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        int i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter order of matrix: ");
        int n = s.nextInt();
        int[][] matA = new int[n][n];
        int[][] matB = new int[n][n];
        int[][] result = new int[n][n];
        System.out.println("Read first matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("matA["+i+"]["+j+"]:");
                matA[i][j] = s.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.println("matB["+i+"]["+j+"]:");
                matB[i][j] = s.nextInt();
            }
        }
        System.out.println("The multiplication of two matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    result[i][j] += matA[i][k]*matB[k][j];
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("result["+i+"]["+j+"]:"+result[i][j]);
            }
    }
    
}


