import java.util.Scanner;

public class replace {
  public static String replaceWord(String sentence, String oldWord, String newWord) {
    return sentence.replaceAll(oldWord , newWord);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    String oldWord = s.nextLine();

    String newWord = s.nextLine();

    System.out.println(replaceWord(str, oldWord, newWord));
  }
}
