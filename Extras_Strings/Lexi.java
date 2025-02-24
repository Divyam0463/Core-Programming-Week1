import java.util.Scanner;

public class Lexi {
  static void checkOrder(String str1, String str2) {
    int resultComparison = str1.toLowerCase().compareTo(str2.toLowerCase());

    if (resultComparison < 0) {
      System.out.println(str1 + " comes before " + str2);
    } else if (resultComparison > 0) {
      System.out.println(str2 + " comes before " + str1);
    } else {
      System.out.println(str1 + " is equal to " + str2);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String str1 = s.nextLine();
    String str2 = s.nextLine();
    s.close();

    checkOrder(str1.toLowerCase(), str2.toLowerCase());
  }
}
