
import java.util.Scanner;

public class power_arithm {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num = s.nextInt() ; 
    int power = s.nextInt(); 

    int res = 1 ; 

    for (int i = 1; i <= power; i++) {
      res *= num ; 
    }
    System.out.println(res);
  }
}
