
import java.util.Scanner;

public class mul_table2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    for (int i = 1; i <= 10; i++) {
      if(num % i == 0) {
        System.out.println(i + " * "+num/i);
      }
    }
  }
}
