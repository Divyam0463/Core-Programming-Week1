import java.util.Scanner;

public class abundant {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int n = s.nextInt() ; 

    int sum = 0 ; 

    for (int i = 1; i < n; i++) {
      if ( n%i == 0 ) sum += i ; 
    }

    String ans = (sum>n)?"Yess, its an abundant number":"No" ; 
    System.out.println(ans);
  }
}
