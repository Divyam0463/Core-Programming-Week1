
import java.util.Scanner;

public class illegalArgument {
  static void generateException(String str , int start , int end){
    try {
      str.substring( start , end ) ;
    } catch (Exception e) {
      if (start>end){
        System.err.println("IllegalArgument exception .. (start > end) "+e.getMessage());
        return ; 
      }
    }
    System.out.println(str.substring(start, end));
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next() ;

    generateException(str, 2, 3);

    s.close();
  }
}
