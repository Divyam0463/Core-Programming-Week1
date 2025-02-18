
import java.util.Scanner;

public class wind {
  public String calculateWindChill(double temperature, double windSpeed){
    double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16); 

    String ans = String.format("%.2f",windChill ) ; 
    return ans ; 
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 
    wind w =new wind() ; 

    System.out.println("Input temperature: ");
    double temp = s.nextInt() ; 
    System.out.println("Input windSpeed: ");
    double windSpeed = s.nextInt() ; 

    System.out.println("Wind-chil is: ");
    System.out.println(w.calculateWindChill(temp , windSpeed));
  }
}
