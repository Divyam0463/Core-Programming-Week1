import java.util.Scanner;

class quotiet_rem {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num1 = s.nextInt() ; 
    int num2 = s.nextInt() ; 

    System.out.println("The Quotient is: "+num1/num2 +" and Reminder is: "+num1%num2+" of two number: "+num1+ " and "+ num2);
  }
  
}