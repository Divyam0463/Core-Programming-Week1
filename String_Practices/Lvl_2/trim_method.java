import java.util.Arrays;
import java.util.Scanner;

public class trim_method {
  static int[] doTrim(String str){
    int start = 0 , end = str.length() ;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i)!=' ') {
        break ;  
      }start++ ; 
    }

    for (int i = str.length() - 1; i >= 0 ; i--) {
      if (str.charAt(i)!=' ') {
        break ;  
      }end-- ; 
    }

    return new int[]{start , end} ; 
  }

  static String subChar(int start , int end , String str){
    StringBuilder sb = new StringBuilder() ; 
    for (int i = start; i < end; i++) {
      sb.append(str.charAt(i)) ; 
    }

    return sb.toString() ; 
  }

  static boolean compare(String str , String str2){
    return str.equals(str2) ; 
  }
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ; 

    String str = s.nextLine() ; 
    System.out.println("Length: "+str.length());

    int arr[] = doTrim(str) ; 

    String ans = "" ; 

    for (int i = arr[0]; i < arr[1]; i++) {
      ans += str.charAt(i) ; 
    }
    System.out.println("Manually: "+ans);

    System.out.println(Arrays.toString(arr));

    System.out.println(subChar(arr[0], arr[1], str));

    System.out.println("check comparison: " + compare( ans , subChar(arr[0], arr[1], str) ));

    s.close();
  }
}
