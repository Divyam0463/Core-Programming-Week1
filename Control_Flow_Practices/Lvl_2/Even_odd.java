
import java.util.Scanner;

public class Even_odd {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    for (int i = 1; i <= num ; i++) {
      if(i % 2 == 0 ) System.out.println(i+" is Even");
      else {
        System.out.println(i+" is Odd");
      }
    }
  }
}
