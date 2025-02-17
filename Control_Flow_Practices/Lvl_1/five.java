
import java.util.Scanner;

public class five {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;
    int num = s.nextInt() ; 

    String res = (num % 5 == 0) ? "YES"  : "NO" ; 
    
    System.out.println("Is the number: "+num+" divisible by 5? "+ res);
  }  
}
