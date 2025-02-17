import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Input weight:(in kgs)");
    double weight = s.nextDouble() ;
    System.out.println("Input height: (in cms)");
    double heightInCms = s.nextDouble() ;

    double heightInMs = heightInCms/100.0  ;

    double BMI = weight / (heightInMs * heightInMs) ; 

    if (BMI<=18.4) System.out.println("Underweight");
    else if(BMI>=18.5 && BMI <=24.9) System.out.println("Normal");
    else if(BMI>=25.0 && BMI <=39.9) System.out.println("OverWeight");
    else if(BMI>=40.0) System.out.println("Obese");
  }
}
