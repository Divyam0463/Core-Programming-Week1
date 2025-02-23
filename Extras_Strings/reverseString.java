import java.util.Scanner;

public class reverseString {
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
    
    System.out.println(reverseString(str));
  }
}