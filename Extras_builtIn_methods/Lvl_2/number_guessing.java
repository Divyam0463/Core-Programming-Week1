import java.util.*;

public class number_guessing {
  public static void main(String[] args) {
    System.out.println("enter number: ");
    checkNum();
  }

  private static void checkNum() {
    Scanner sc = new Scanner(System.in); // scanner class
    Random random = new Random();
    int comp = random.nextInt(101); // comp number

    while (true) {
      if (sc.hasNextInt()) {  // // Check if the input is an integer

        int num = sc.nextInt(); //input here
        if (num > comp) {
          System.out.println("high, do enter low number.");

        } else if (num < comp) {
          System.out.println("low, do enter high number.");
          
        } else if (num == comp) {
          System.out.println("right guess !!"); // here , condition is met , so breaks out of the infinite loop
          break;
        }
      }
      else{
        System.out.println("integer not entered");
        break ; 
      }
    }
  }
}
