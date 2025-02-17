
import java.util.Scanner;

public class mul_table {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    for (int i = 6; i <= 9; i++) {
      if (num % i == 0) {
        System.out.println(num/i +" * "+i);
      }
    }
  }
}
