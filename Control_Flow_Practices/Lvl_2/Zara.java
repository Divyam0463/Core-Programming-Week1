import java.util.Scanner;

public class Zara {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;

    System.out.println("Input salary");
    double Salary = s.nextDouble() ; 
    int years = s.nextInt() ;  

    if (years > 5) {
      Salary += (5.0/100)*Salary ; 
    }
    System.out.println(Salary);
  }
}
