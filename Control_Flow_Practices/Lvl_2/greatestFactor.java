import java.util.Scanner;

public class greatestFactor {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 
    int greatestFactor = 0 ; 

    for (int i = num-1; i >= 1 ; i--) {
      if (num % i == 0) {
        greatestFactor = i ; 
        break ; 
      }
    }
    System.out.println("greatest_Factor is : "+greatestFactor);
  }
}
