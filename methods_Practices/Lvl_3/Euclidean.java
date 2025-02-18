import java.util.Scanner;

public class Euclidean {

  static double findDist(int [][] arr){
    double sq1 = Math.pow((arr[1][0] - arr[0][0]), 2) ; //x^2
    double sq2 = Math.pow((arr[1][1] - arr[0][1]), 2) ; //y^2

    double dist = Math.sqrt(sq1+sq2) ; 
    return dist ; 
  }

  static double[] findEquation(int [][] arr){
    double m = (arr[1][1] - arr[0][1])*1.0 / (arr[1][0] - arr[0][0]) ;  //slope
    double b = arr[0][1] - m*arr[0][0]  ; //computing y-intercept

    System.out.println("equation is: "+ " y " +" = " +m+"*x + "+ b );

    double [] res = new double[2] ; 
    res[0] = m ; //slope 
    res[1] = b ; // y-intercept

    return res ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int [][] ans = new int[2][2] ;

    for (int i = 0; i < ans.length; i++) {
      for (int j = 0; j < ans.length; j++) {
        System.out.println("Input number "+i+","+j+" :") ; 
        ans[i][j] = s.nextInt() ; 
      }
    } 

    System.out.println("Distance is: "+findDist(ans));

    double equation[] = findEquation(ans);
    System.out.println("Slope: " + equation[0]);  
    System.out.println("Y-intercept: " + equation[1]); 
  }
}
