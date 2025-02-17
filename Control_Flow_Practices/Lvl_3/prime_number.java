import java.util.Scanner;

public class prime_number {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n = s.nextInt() ;

    if (n==0 || n==1) {
      System.out.println("Neither prime nor composite");
      return ; 
    }
    
    for (int i = 2; i < n ; i++) {
      if (n%i == 0) {
        System.out.println(n+" Composite");
        return ; 
      }
    }
    System.out.println(n+" Prime");
  }
}
