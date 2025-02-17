import java.text.DecimalFormat;
import java.util.Scanner;

public class triangle_base_height {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    DecimalFormat df = new  DecimalFormat("0.0") ;

    int base = s.nextInt() ; 
    int height = s.nextInt() ; 

    double area = (1.0/2 * base * height)/2.54 ; //converted cm in inch 
    double feetArea = area / 12 ; 
    double inchArea = area % 12 ; 

     

    System.out.println("Your area in cm is: "+df.format(area*2.54) + " while in feet is: "+ (long)feetArea+" and inches is: "+df.format(inchArea));
  }
}
