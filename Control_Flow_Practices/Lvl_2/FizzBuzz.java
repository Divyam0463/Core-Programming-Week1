
import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num = s.nextInt();

    if (num > 0) {
      for (int i = 0; i <= num; i++) {

        if(i == 0 ) System.out.println(i); 
        
        else if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");

        else if (i % 3 == 0) System.out.println("Fizz");

        else if (i % 5 == 0) System.out.println("Buzz");

        else {
          System.out.println(i);
        }
      }
    }
  }
}
