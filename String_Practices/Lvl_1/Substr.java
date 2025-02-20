
import java.util.Scanner;

public class Substr {

  static String subChar(int start , int end , String str){
    StringBuilder sb = new StringBuilder() ; 
    for (int i = start; i < end; i++) {
      sb.append(str.charAt(i)) ; 
    }

    return sb.toString() ; 
  }


  static String sub1(String str){
    return str.substring(0, str.length()) ;
  }

  static boolean compare(String str , String str2){
    return str.equals(str2) ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next() ;  

    for (int i = 0; i < str.length(); i++) {
      String temp = subChar(i, str.length(), str) ; 
      System.out.println((i+1)+". "+temp+" : "+compare(str, temp));
    }

    System.out.println("Using in-built method: "+compare(str, sub1(str)));
    s.close();
  }
}
