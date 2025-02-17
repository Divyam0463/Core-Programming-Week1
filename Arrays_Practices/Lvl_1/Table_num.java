
import java.util.Scanner;

public class Table_num {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int[] arr = new int[10] ; 
    int sum = 0 , k = 0 ;

    for (int i = 0; i < 10; i++) {
      arr[i] = s.nextInt() ; 
      if (arr[i] <= 0) {
        break ;  
      }
      k++ ; 
    }

    for (int i = 0; i < k; i++) {
      if (arr[i] > 0 ) {
        sum+=arr[i] ; 
      }
      System.out.println("Element: "+arr[i]+" Sum: "+sum);
    }

  }
}
