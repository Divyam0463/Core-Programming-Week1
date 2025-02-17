import java.util.Scanner;

public class sumUntilZero {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 
    double num = s.nextInt() ;

    double sum = 0.0 ;

    while (num != 0.0) {
      sum += num ; 
      num = s.nextInt() ; 
    }

    System.out.println(sum);
  }  
}
