import java.util.Scanner;

public class sumUntilNegative {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 
    int num = s.nextInt() ;

    int sum = 0 ;

    while (true) {
      if (num <= 0) {
        break ; 
      }
      sum += num ; 
      num =s.nextInt() ; 
    }

    System.out.println(sum);
  } 
}
