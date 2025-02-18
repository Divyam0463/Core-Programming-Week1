
import java.util.Scanner;

public class number {

  static int calc(int n){
    int sum = 0 ; 

    for (int i = 1; i <= n; i++) {
      sum += i ; 
    }
    return sum ; 
  }

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 

    int n = s.nextInt() ; 

    System.out.println(calc(n));
  }
}