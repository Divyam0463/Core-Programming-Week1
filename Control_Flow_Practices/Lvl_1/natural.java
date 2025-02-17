import java.util.Scanner;

public class natural {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num1 = s.nextInt() ;
    
    if (num1>0) {
      int ans = (num1*(num1+1))/2 ; 
      System.out.println("The sum of "+num1 + " natural numbers is: "+ans);
      return;
    }
    System.out.println("The number: "+ num1+" is not a natural number.");
  }
}
