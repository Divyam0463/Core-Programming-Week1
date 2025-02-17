import java.util.Scanner;  

public class Harshad {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int n = s.nextInt() ; 

    int sum = 0 ; 
    int old = n ; 

    while (n!=0) {
      sum += n%10 ;
      n /= 10 ;  
    }

    String ans = (old % sum == 0)?"its a harshad number !":"nope.." ;
    System.out.println(ans); 
  }
}
