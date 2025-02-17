import java.util.Scanner;

public class fizz_array {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ;  

    int arr_len = 0 ;
    String [] ans = new String[num] ; 
    int k = 0 ;

    for (int i = 1; i <= num; i++) {
      if ( num % i == 0 ) {
        if( i % 3 == 0 && i % 5 == 0 ){
          ans[k++] = "fizzbuzz";
        }
        else if(i % 3 == 0 ) ans[k++] = "fizz" ; 
        else if(i % 5 == 0 ) ans[k++] = "buzz" ; 
        else{ans[k++] = Integer.toString(i) ; } //converting i index to String
      }
    }

    for (int i = 0; i < k; i++) {
      System.out.print(ans[i]+" ");
    }
  }
}
