import java.util.Arrays;
import java.util.Scanner;

public class unique_charFreq {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();

    String[][] uniq = checkArray(str);

    for (String[] uniq1 : uniq) {
      if (uniq != null) {
        System.out.println("Character: " + uniq1[0] + " Freq: " + uniq1[1]);
      }
    }

    s.close();
  }

  private static String[][] checkArray(String str) {
    int[] freq = new int[256];
    String[][] uniq = new String[256][2];

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      freq[ch]++; // all the frequencies stored
    }

    int uniqIndex = 0;

    for (int i = 0; i < 256; i++) {
      if (freq[i] == 1) {
        uniq[uniqIndex][0] = String.valueOf((char) i);
        uniq[uniqIndex][1] = String.valueOf(freq[i]);
        uniqIndex++;
      }
    }

    return Arrays.copyOf(uniq, uniqIndex);
  }
}
