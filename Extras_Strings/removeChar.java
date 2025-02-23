
import java.util.Scanner;

public class removeChar {
  public static String removeCharacter(String str, char charToRemove) {
    return str.replace(String.valueOf(charToRemove), "");
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    char ch = s.next().charAt(0) ; 

    System.out.println(removeCharacter(str, ch));
  }
}
