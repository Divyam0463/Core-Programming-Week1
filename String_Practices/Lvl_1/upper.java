import java.util.Scanner;

public class upper {

  static String convertToUpper(String str){
    String ans = "" ; 
    for (int i = 0; i < str.length(); i++) {
      char ch= str.charAt(i) ; 
      ans += (char)(ch - 32); 
    }

    return ans ;
  }

  static boolean compare(String str1 , String str2){
    if (str1.length() != str2.length()) return false; 

    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return false ; 
      }
    } return true ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;
    String str = s.next() ;

    String upper = convertToUpper(str) ; 
    System.out.println(upper);
    System.out.println(compare(str, upper.toLowerCase())) ;
    s.close();
  }
}
