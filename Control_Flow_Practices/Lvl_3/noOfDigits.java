import java.util.Scanner;

public class noOfDigits {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n = s.nextInt() ;
    int cnt = 0 ; 

    while (n!=0) {
      cnt++ ; 
      n /= 10 ; 
    }
    System.out.println(cnt);
  }
}
