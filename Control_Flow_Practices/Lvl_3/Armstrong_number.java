
import java.util.Scanner;

public class Armstrong_number {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n = s.nextInt() ; 
    int sum = 0 ;
    int rem = 0 ; 
    int old = n ; 

    while (n != 0) {
      sum += Math.pow((n%10), 3) ; 
      n /= 10 ;       
    }

    if (sum == old) System.out.println("Armstrong number it is ! ");
    else{
      System.out.println("Not an Armstrong number . ");
    }  
    
  }
}
