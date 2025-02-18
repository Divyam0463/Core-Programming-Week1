import java.util.Scanner;

public class rec_number {
  static int rec(int n){
    if (n == 1) {
      return 1 ; 
    }
    return n + rec(n-1) ;
  }

  static int simple(int n){
    return  (n*(n+1)) / 2  ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num = s.nextInt() ; 

    System.out.println("Using Recursion: ");
    System.out.println(rec(num));
    System.out.println("Using formula: ");
    System.out.println(simple(num));
    String ans = (simple(num) == rec(num))?"True":"False" ;
    
    System.out.println(ans);
  }
}
