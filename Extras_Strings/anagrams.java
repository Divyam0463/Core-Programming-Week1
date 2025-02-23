
import java.util.Scanner;

public class anagrams {
  public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    
    int[] charCounts = new int[256]; // Assuming ASCII characters
    for (char c : str1.toCharArray()) {
      charCounts[c]++;
    }
    for (char c : str2.toCharArray()) {
      charCounts[c]--;
    }
    
    for (int count : charCounts) {
      if (count != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ; 

    String str1 = s.nextLine() ; 
    String str2 = s.nextLine() ;

    System.out.println("Are they anagrams: "+areAnagrams(str1, str2));
  }
}
