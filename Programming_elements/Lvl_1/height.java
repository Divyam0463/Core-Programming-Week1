
import java.util.Scanner;

public class height {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    double cm = s.nextDouble() ; 

    double totalInch = cm/2.54 ; 
    int feet =(int) totalInch/12 ; 

    String leftInch = String.format( "%.2f" , totalInch%12) ; 
    
    System.out.println("Your Height in cm is: "+ cm+ " while in feet is: "+feet+" and inches are: "+leftInch);
  }
}
