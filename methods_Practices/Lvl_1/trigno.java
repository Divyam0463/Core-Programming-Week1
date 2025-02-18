
import java.util.Arrays;
import java.util.Scanner;

public class trigno {
  public double[] calculateTrigonometricFunctions(double angle){
    double radian = Math.toRadians(angle) ; 
    double [] ans = new double[3] ; 


    ans[0] = Math.sin(radian) ; 
    ans[1] = Math.cos(radian) ;
    ans[2] = Math.tan(radian) ; 
    return ans ; 
    
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    System.out.println("Input angle: ");
    double angle = s.nextDouble() ; 

    trigno t = new trigno() ; 

    double[] ans = t.calculateTrigonometricFunctions(angle) ;
    System.out.println(Arrays.toString(ans));

  }
}
