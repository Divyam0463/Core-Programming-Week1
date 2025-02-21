import java.util.Scanner;

public class frequency_2D {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String str = s.nextLine();

    checkFreq(str);
  }

  private static void checkFreq(String str) {
    int[][] freq = new int[256][2];

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      freq[ch][0] = ch;
      freq[ch][1]++;
    }

    for (int i = 0; i < 256; i++) {
      if (freq[i][1] > 0) {//if present in the array , then it will be printed 
        System.out.println("character: " + (char) freq[i][0] + " frequency: " + freq[i][1]);
      }
    }
  }
}
