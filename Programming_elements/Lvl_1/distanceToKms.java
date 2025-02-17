
import java.util.Scanner;

public class distanceToKms {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ;
    int km = s.nextInt();

    double mile = (double)km * 1.6 ; 
    System.out.println("The total miles is: "+ mile+ " mile for the given: " + km+ " km");
  }
}
