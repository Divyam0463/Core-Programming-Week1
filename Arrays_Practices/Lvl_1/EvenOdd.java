import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in) ; 

    int n = s.nextInt() ; 
    int[] arr = new int[n] ;
    
    int k = 0, m = 0; 

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt() ;
      if (arr[i] % 2 == 0 ) k++ ;
      else {
        m++ ; 
      }       
    }

    int [] even = new int[k] ; 
    int [] odd = new int[m] ;

    int evenIndex = 0 , oddIndex = 0 ; 

    for (int i = arr.length - 1; i >= 0 ; i--) {
      if (arr[i] % 2 == 0) {
        even[evenIndex++] = arr[i] ; 
      }
      else  {
        odd[oddIndex++] = arr[i] ; 
      }
    }

    System.out.println(Arrays.toString(even));
    System.out.println(Arrays.toString(odd));
  }
}
