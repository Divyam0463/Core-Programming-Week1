
import java.util.Scanner;

public class factors {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    for (int i = 1; i <= num; i++) {
      if (num%i == 0) System.out.println("is a factor: "+i) ;
    }
  }
}
