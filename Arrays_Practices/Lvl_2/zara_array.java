
import java.util.Scanner;

public class zara_array {
  // Check for non-negative input 
  private static double getValidDoubleInput(Scanner s, String prompt) {
    double input;
    while (true) {
        System.out.println(prompt); // Print the prompt
        if (s.hasNextDouble()) {
            input = s.nextDouble();
            if (input >= 0) { // Check for non-negative input 
                return input;
            } else {
                System.out.println("Invalid input. Please enter a non-negative number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number:");
            s.next(); // Consume the invalid input
        }
    }
}
  public static void main(String[] args) {
    double[][] old = new double[3][2];
    double[][] ans = new double[3][2];
    int sumOld= 0 ; 
    int sumNew = 0 ; 
    int bonus = 0 ; 

    Scanner s = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      old[i][0] = getValidDoubleInput(s,"Enter salary for employee " + (i + 1) + ":");

      old[i][1] = getValidDoubleInput(s,"Enter age experience for employee " + (i + 1) + ":");
  }

    for (int i = 0; i < old.length; i++) {

      if (old[i][1] > 5) {
        ans[i][0] = old[i][0] + (5.0 / 100) * (old[i][0]);
      } else if (old[i][1] > 0 && old[i][1] <= 5) {
        ans[i][0] += old[i][0]+ (2.0 / 100) * (old[i][0]);
      }
      ans[i][1] = ans [i][0] - old[i][0] ; 
      bonus += ans [i][0] - old[i][0] ; 
      sumOld += old[i][0] ; 
      sumNew += ans[i][0] ;  
    }

    for (int i = 0; i < ans.length; i++) {
      System.out.println("\nNew Salary and Bonus for employee " + (i+1) + ":");
      for (int j = 0; j < ans[i].length; j++) {
        
        System.out.print(ans[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("Total old salary: "+sumOld+"\nTotal new salary: "+sumNew+"\nTotal Bonus Payout: "+bonus);
  }
}
