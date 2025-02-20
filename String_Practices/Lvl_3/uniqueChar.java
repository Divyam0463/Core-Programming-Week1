import java.util.Arrays;
import java.util.Scanner;

public class uniqueChar {
  static int getLen(String str){
    return str.length() ; 
  }

  static char[] getunique(String str , int len){
    char[] arr = new char[str.length()] ;
    int k = 0 ; 

    for (int i = 0 ; i < str.length() ; i++) {
      char ch = str.charAt(i) ; 
      boolean check_flag = false ; 
      for (int j = i; j < arr.length; j++) {
        if (i!=j && ch == str.charAt(j)) {
          check_flag = true ;
          break; 
        }
      }
      if (!check_flag) {
        arr[k++] = str.charAt(i) ;
      }
    } 

    return Arrays.copyOf(arr, k) ;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in); 

    String str= s.nextLine() ;
    int len = getLen(str) ; 

    s.close();

    char[] arr = getunique(str, len) ; 
    System.out.println(Arrays.toString(arr));
  }
}
