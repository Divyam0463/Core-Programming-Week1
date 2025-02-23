import java.util.Scanner;

public class longest_word {
  public static String findLongestWord(String sentence) {
    String[] words = sentence.split(" ");
    String longestWord = "";
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    return longestWord;
}
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.nextLine() ; 

    System.out.println(findLongestWord(str));
  }
}
