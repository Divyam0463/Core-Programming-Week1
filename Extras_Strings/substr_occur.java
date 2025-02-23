import java.util.Scanner;

public class substr_occur {
  public static int findSubstringOccurrences(String str, String sub) {
    int count = 0;
    for (int i = 0; i <= str.length() - sub.length(); i++) {
      if (str.substring(i, i + sub.length()).equals(sub)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine() ; 
    String sub = s.nextLine() ; 

    System.out.println(findSubstringOccurrences(str, sub));
  }
}
