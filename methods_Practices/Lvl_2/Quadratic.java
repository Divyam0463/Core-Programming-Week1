import java.util.Scanner;

public class Quadratic {
  static void find(double a, double b, double c){
    double delta = Math.pow(b, 2) -  4*a*c ;

    if (delta > 0) {
      double root1 = (-b + Math.sqrt(delta))/(2*a)  ;
      double root2 = (-b - Math.sqrt(delta))/(2*a)  ;
      System.out.println("Root 1: "+root1);
      System.out.println("Root 2: "+root2);
    }
    else if(delta == 0){
      double root1 = -b/(2*a) ; 
      System.out.println("Root 1: "+root1) ;
    }
    else if(delta<0) return ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    //equation -> ax^2 + bx + c ; 
    int a = s.nextInt() ; 
    int b = s.nextInt() ; 
    int c = s.nextInt() ; 

    System.out.println("Equation: " + a + "x² + " + b + "x + " + c + " = 0");
    System.out.println("roots are: ");
    find(a, b, c);

    s.close();
  }
}
