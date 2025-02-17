
import java.util.Scanner;

public class TwoD_1D {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Input rows: ");
    int rows = s.nextInt() ; 
    System.out.println("Input cols: ");
    int cols = s.nextInt() ; 

    int [][] arr = new int[rows][cols] ; 

    int [] ans = new int [rows*cols] ; 

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = s.nextInt() ; 
      }
    }
    int k = 0;   

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        ans[k++] = arr[i][j] ; 
      }
    }

    for (int i = 0; i < k; i++) {
        System.out.print(ans[i]+" ");
    }
  }
}
