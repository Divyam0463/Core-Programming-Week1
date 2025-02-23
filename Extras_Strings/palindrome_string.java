
import java.util.Scanner;

public class palindrome_string {
  static boolean isPalindrome(String str) {
    String reversed = reverseString(str);
    return str.equals(reversed);
  }

  static String reverseString(String str) {
    char[] charArray = str.toCharArray();
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      char temp = charArray[left];
      charArray[left] = charArray[right];
      charArray[right] = temp;
      left++;
      right--;
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.nextLine() ; 

    System.out.println("is it palindrome? : "+isPalindrome(str));
  }
}
