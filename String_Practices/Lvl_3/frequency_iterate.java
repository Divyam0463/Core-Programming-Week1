import java.util.Arrays;
import java.util.Scanner;

public class frequency_iterate {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();

    System.out.println(Arrays.toString(checkFreq(str)));
    s.close();
  }

  private static String[] checkFreq(String str) {
    char[] chars = str.toCharArray();
    int[] freq = new int[chars.length];

    String [] result = new String[2*chars.length] ; 

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != '0') { //agr 0 nai , means char is still to be counted
        freq[i] = 1;
        for (int j = i + 1; j < chars.length; j++) {
          if (chars[i] == chars[j] && chars[j] != 0) {
            freq[i]++;
            chars[j] = '0'; // marking the duplicate character not the original one
          }
        }
      }
    }

    int i = 0 , j = 0 ;
    int idx = 0 ;  

    while(i< chars.length && j<freq.length) {
      if (chars[i] != '0' || freq[j] != 0 ) {
        result[idx++] = String.valueOf(chars[i]) ; 
        result[idx++] = String.valueOf(freq[j]) ;
      }i++ ; 
      j++ ; 
    }

    return Arrays.copyOf(result, idx) ;
  }
}
