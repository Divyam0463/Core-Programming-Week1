import java.util.Scanner;

public class small {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n1 = s.nextInt() ; 
    int n2 = s.nextInt() ; 
    int n3 = s.nextInt() ; 

    String ans = (n1 < n2 && n1<n3) ? "YES":"NO" ; 

    System.out.println("Is the first number the smallest? "+ans);
  }
}
