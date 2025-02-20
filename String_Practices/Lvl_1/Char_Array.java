
import java.util.Arrays;
import java.util.Scanner;

public class Char_Array {
  static boolean compare(char[] arr1 , char[] arr2){
    return Arrays.equals(arr1, arr2) ;
  }

  static char[] userChars(String str){
    char [] c = new char[str.length()] ;

    for (int i = 0; i < str.length(); i++) {
      c[i]  = str.charAt(i) ;  
    }
    return c ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next() ;

    System.out.println("Comparison using user-defined: "+compare(str.toCharArray(), userChars(str)));
  }
}
