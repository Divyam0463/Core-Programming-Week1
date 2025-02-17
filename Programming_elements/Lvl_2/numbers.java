import java.text.DecimalFormat;
import java.util.Scanner;

public class numbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    float num1 = s.nextFloat() ; 
    float num2 = s.nextFloat() ; 

    DecimalFormat df = new DecimalFormat("0.0"); //imported object from decimal class for point to decimal to be shown only as one.

    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers: "+num1+" and "+num2+" is: "+ df.format(num1+num2)+" ,"+df.format(num1-num2)+" ,"+df.format(num1*num2)+" and "+df.format(num1/num2));
  }
}
