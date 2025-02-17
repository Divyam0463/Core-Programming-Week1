
import java.util.Scanner;

public class football {
  public static void main(String[] args) {
    int[] arr = new int[11] ; 
    Scanner s = new Scanner(System.in) ; 
    int sum = 0 ;  

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt() ; 
    }

    for (int i = 0; i < arr.length; i++) {
      sum+= arr[i] ; 
    }

    System.out.println("Mean height: "+sum/11);
  }
}
