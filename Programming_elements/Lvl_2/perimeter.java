
import java.util.Scanner;

public class perimeter {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int side = s.nextInt() ; 

    int area = 4*side ; 

    System.out.println("The length of the side is: "+side+" whose perimeter is: "+area );
  }
}
