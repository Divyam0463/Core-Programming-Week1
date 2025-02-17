import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("enter year: ");
    int year = s.nextInt();

    if (year >= 1582 && year % 4 == 0) {
      if (year % 100 == 0 && year % 400 != 0) {
        System.out.println("not a leap year");
        return;
      }
      System.out.println("Leap year");
      return;
    }
    System.out.println("not a Leap year");
  }
}
