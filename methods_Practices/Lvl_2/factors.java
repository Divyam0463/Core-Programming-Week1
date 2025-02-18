import java.util.Arrays;
import java.util.Scanner;

public class factors {
  static int[] factors(int num){
    int [] ans = new int[num]; 
    int k = 0 ; 

    for (int i = 1; i < num; i++) {
      if (num%i == 0) {
        ans[k++] = i ;
      }   
    }

    int [] temp = Arrays.copyOf(ans, k) ; 
    ans = new int[k] ; 
    System.arraycopy(temp,0 ,ans ,0 , k) ;

    return ans ; 
  }

  static int sum(int [] arr){

    int sum = 0 ; 
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i] ;
    } 
    return sum ; 
  } 

  static int pro(int [] arr){
    int product = 1 ;

    for (int i = 0; i < arr.length; i++) {
      product *= arr[i] ;
    }

    return product ;
  }

  static int square(int [] arr){
    int sumSq = 0 ;

    for (int i = 0; i < arr.length; i++) {
      sumSq += Math.pow( arr[i] ,2) ; 
    }

    return sumSq  ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int n = s.nextInt() ; 

    int [] ans = factors(n) ; 
    System.out.println(Arrays.toString(ans));

    System.out.println("Sum: "+sum(ans)) ;

    System.out.println("Product: "+pro(ans)) ;

    System.out.println("Sum of squares of factors: "+square(ans)) ;
  } 
}