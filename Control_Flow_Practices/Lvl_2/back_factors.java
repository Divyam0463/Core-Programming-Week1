
import java.util.Scanner;

public class back_factors {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    for (int i = num; i >= 1; i--) {
      if (num % i == 0 ) System.out.println("Factors: "+i);
    }
  }
}
