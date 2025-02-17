import java.util.Scanner;

public class IntOperations {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int a = s.nextInt() ; 
    int b = s.nextInt() ; 
    int c = s.nextInt() ; 

    
    System.out.println("The results of Int Operations are: "+(a+b*c) +" , "+(a*b+c)+" , "+(a%b+c)) ;
  }
}
