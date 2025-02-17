import java.util.Scanner;

public class Handshakes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int students = s.nextInt() ; 

    int combination = students * (students - 1) / 2  ; 

    System.out.println("the number of possible handshakes are: "+combination);
  }
}
