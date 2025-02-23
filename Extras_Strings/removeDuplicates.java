import java.util.Scanner;

public class removeDuplicates {
  public static String remove_Duplicates(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (sb.indexOf(String.valueOf(c)) == -1) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();

    System.out.println(remove_Duplicates(str));
  }
}
