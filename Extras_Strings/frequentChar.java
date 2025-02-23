import java.util.Scanner;

public class frequentChar {
  static char findFreq(String str) {
    int[] freq = new int[256];
    int max = Integer.MIN_VALUE;
    int maxi = 0 ; 

    if (str == null) {
      return '\0' ; //returning null in form of char..
    }

    for (int i = 0; i < str.length(); i++) {
      int ch = str.charAt(i) ; //for hello , first ch = 104 , 100 
      freq[ch]++;
    }

    for (int i = 0; i < freq.length; i++) {
      if (freq[i] > max) {
        maxi = i ;
        max = freq[i] ; 
      }
    }

    return (char)maxi ;  
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();

    System.out.println(findFreq(str));
  }
}
