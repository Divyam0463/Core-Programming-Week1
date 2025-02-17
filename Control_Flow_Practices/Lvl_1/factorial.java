
import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 
    int mul = 1 ;

    while(num!=1){
      mul *= num ; 
      num--;   
    }

    System.out.println(mul);
  }
}
