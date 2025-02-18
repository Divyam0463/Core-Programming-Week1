import java.util.Scanner;

public class collinear {

  static boolean calcCollinear(int [][] nums,double x1,double y1,double x2,double y2,double x3,double y3){ 

    double slope1 = (y2 - y1)/(x2 - x1) ; 
    double slope2 = (y3 - y2)/(x3 - x2) ; 
    double slope3 = (y3 - y1)/(x3 - x1) ; 

    if (slope1 == slope2 && slope2 == slope3) {
      return true ; 
    }return false ;
  }

  static boolean calcColTria(int [][] nums,double x1,double y1,double x2,double y2,double x3,double y3){
    double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) ; 
    if (area == 0) {
      return true ;       
    }return false ;
  }
public static void main(String[] args) {
  Scanner s = new Scanner(System.in) ; 
  int [][] nums = new int[3][2] ;

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
      System.out.println("Input number "+i+","+j+" :") ; 
      nums[i][j] = s.nextInt() ; 
    }
  } 
  double x1 = nums[0][0] ; 
  double y1 = nums[0][1] ; 

  double x2 = nums[1][0] ;
  double y2 = nums[1][1] ; 
  
  double x3 = nums[2][0] ; 
  double y3 = nums[2][1] ;

  System.out.println("are the points collinear? : "+calcCollinear(nums, x1, y1, x2, y2, x3, y3));
  System.out.println("are the points collinear? (using tria formulae) : "+calcColTria(nums, x1, y1, x2, y2, x3, y3));

  s.close();
}
}
