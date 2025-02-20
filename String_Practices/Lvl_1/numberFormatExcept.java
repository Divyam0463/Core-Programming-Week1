
import java.util.Scanner;

public class numberFormatExcept {
  static void generateException(String str){
    int num = 0 ;
    try {
      num = Integer.parseInt(str) ;
      System.out.println(num); 
    } catch (NumberFormatException e) {
      // TODO: handle exception
      if (num == 0) {
        System.err.println("number format exception , no nums!.. " + e.getMessage()) ;
        return ;
      }
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next() ;
    s.close();
    
    generateException(str);
  }
}
