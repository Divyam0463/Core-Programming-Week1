import java.util.Scanner;

public class any {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n1 = s.nextInt() ; 
    int n2 = s.nextInt() ; 
    int n3 = s.nextInt() ; 

    String ans = (n1 > n2 && n1>n3) ? "YES":"NO" ; 

    String ans2 = (n1 < n2 && n3<n2) ? "YES":"NO" ; 

    String ans3 = (n1 < n3 && n1<n3) ? "YES":"NO" ; 

    System.out.println("Is the first number the largest?\n "+ans+"\nIs the second number the largest?\n "+ans2+"\nIs the third number the largest?\n "+ans3) ;
  }
}
