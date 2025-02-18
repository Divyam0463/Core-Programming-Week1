import java.util.Scanner;

public class HandShakes {
  static int calcHand(int n){
    return (n * (n - 1)) / 2 ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int n = s.nextInt() ;
    System.out.println(calcHand(n)); 
  }
}
