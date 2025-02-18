import java.util.Arrays;
import java.util.Scanner;

public class quotient_rem {
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int [] result = new int[2] ;

    result[0] = number%2 ;
    result[1] = number/2 ; 

    return result ; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ; 

    System.out.println("Input number: ");
    int number = sc.nextInt() ; 
    System.out.println("Input divisor: ");
    int divisor = sc.nextInt() ; 

    int [] ans = findRemainderAndQuotient(number, divisor) ; 

    System.out.println("Remainder and Quotient: ");

    System.out.println(Arrays.toString(ans));
  }
  
}
