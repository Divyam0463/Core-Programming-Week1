import java.util.Arrays;
import java.util.Scanner;

public class SplitText {
  static String[] getArray(String str){
    int cnt = 0 ;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        cnt++; 
      } 
    }cnt++ ;

    String [] words = new String[cnt] ; 
    int k = 0 ;  
    String ans = "" ;

    for (int i = 0; i < str.length(); i++) { 
      char ch = str.charAt(i) ; 
      if (ch == 32) { 
        words[k++] = ans ; 
        ans = "" ;
      }
      else{
        ans += ch ; 
      }
    } 
    words[k++] = ans ; 

    return words;  
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 
    String str = s.nextLine() ; 
    String [] ans = str.split(" ") ; 

    System.out.println(Arrays.toString(getArray(str))) ;
    System.out.println(Arrays.toString(ans)) ;
    System.out.println(Arrays.equals(getArray(str), ans)) ;
  }
}