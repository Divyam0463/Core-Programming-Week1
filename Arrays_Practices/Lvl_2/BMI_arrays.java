import java.util.Scanner ; 
class BMI_arrays {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int n = s.nextInt() ; 

    double [][] ans = new double[n][2] ;
    String realAns [][] = new String[n][2] ; 

    for (int i = 0; i < n; i++) {
      System.out.println("input the weight for "+(i+1)+" person (in kgs):");
      ans[i][0] = s.nextDouble() ; 

      System.out.println("input the height for "+(i+1)+" person (in cm):");
      ans[i][1] = s.nextDouble() ; 

    }

    for (int i = 0; i < n; i++) {
      double heightMeters = ans[i][1] / 100.0 ; 

      double BMI = ans[i][0]/ (heightMeters*heightMeters) ; 

      if (BMI<=18.4) {realAns[i][1] = "Underweight" ;} 
      else if(BMI >= 18.5 || BMI <= 24.9) {realAns[i][1] = "Normal";}
      else if(BMI >= 25.0 || BMI <= 39.9) {realAns[i][1] = "OverWeight";}
      else if(BMI>=40.0) {realAns[i][1] ="Obese";}

      realAns[i][0] = String.format("%.1f", BMI) ; //will get converted to string automatically 
    }

    for (int i = 0; i < n; i++) {
      System.out.print(realAns[i][0]+" ");
      System.out.print(realAns[i][1]+" ");
    }
    System.out.println();
  } 
}
