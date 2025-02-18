import java.util.* ;

public class BMI_methods {

  public static double checkBMI(double weight , double height){
    double heightMeters = height / 100.0 ; 

    double BMI = weight / (heightMeters*heightMeters) ; 
    return BMI ; 
  }

  static String status(double BMI){
    if (BMI<=18.4) {return "Underweight" ;} 
    else if(BMI >= 18.5 && BMI <= 24.9) {return "Normal";}
    else if(BMI >= 25.0 && BMI <= 39.9) {return "OverWeight";}
    else if(BMI>=40){
      return "Obese" ; 
    }
    return null ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

     
    double [][] ans = new double[3][3] ; 
    String [] status = new String[3] ;

    for (int i = 0; i < 3; i++) {
      System.out.println("Input weight (in kgs) "+(i+1)+" :") ; 
      ans[i][0] = s.nextDouble() ;
      System.out.println("Input weight: (in cm) "+(i+1)+" :") ; 
      ans[i][1] = s.nextDouble() ; 

      ans[i][2]  = checkBMI(ans[i][0] , ans[i][1] ) ; //storing BMI
      status[i] = status(ans[i][2]) ; 

    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < ans[i].length; j++) {
        System.out.print(ans[i][j]+" ");
      }
    }

    System.out.println("\nStatus: "+Arrays.toString(status));

  }
}
