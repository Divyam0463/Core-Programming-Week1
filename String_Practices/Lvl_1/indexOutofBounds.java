
import java.util.Scanner;

public class indexOutofBounds {
  static void generateException(String str){
    try {
      System.out.println(str.charAt(99));
    } catch (Exception e) {
      // TODO: handle exception
      System.err.println("Array index is OutOfBounds ... "+e.getMessage());
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next() ; 

    generateException(str) ; 
  }
}
