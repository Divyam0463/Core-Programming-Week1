import java.util.Arrays;
import java.util.Scanner;

public class string_palindrome {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str1 = s.nextLine();

    System.out.println("using logic1: " + checkPalindrome1(str1, 0, str1.length() - 1));
    System.out.println("Using logic2: " + checkPalindrome2(str1, 0, str1.length() - 1));
    System.out.println("Using logic3: " + checkPalindrome3(str1));
  }

  private static boolean checkPalindrome3(String str1) {
    char[] rev = rev(str1) ;
    char[] arr = str1.toCharArray() ; 

    return (Arrays.equals(rev, arr)) ;
  }
  
  private static boolean checkPalindrome2(String str1, int start, int end) {
    if (start >= end) {
      return true;
    }

    if (str1.charAt(start) != str1.charAt(end)) {
      return false;
    }

    return checkPalindrome1(str1, start + 1, end - 1);
  }

  private static boolean checkPalindrome1(String str1, int start, int end) {
    while (start <= end) {
      char ch0 = str1.charAt(start);
      char ch1 = str1.charAt(end);
      if (ch0 != ch1) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

    private static char[] rev(String str1) {
      String rev= "" ; 
      for (int i = str1.length()-1; i >= 0; i--) {
        rev += str1.charAt(i) ; 
      }
      return rev.toCharArray() ;
    }
}
