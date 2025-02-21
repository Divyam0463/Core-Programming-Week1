import java.util.Scanner;

public class non_repeating {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    s.close();

    System.out.println("non-repeating character :(first) "+checkFreq(str));
  }

  private static char checkFreq(String str) {
    int[] freq = new int[256];
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      freq[ch]++;
    } 

    for (int i = 0; i < freq.length; i++) {
      char ch = str.charAt(i) ; 

      if (freq[ch] == 1) {
        return ch ; 
      } 
    }
    return '\0' ;//returning null character if no non-repeating found 
  }

}
