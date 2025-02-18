import java.util.Scanner ;

public class Athlete {
  static double calc(int s1 , int s2  ,int s3){
    int perimeter = s1+s2+s3 ; 

    double rounds = Math.round(5 * 1000.0/perimeter) ; 

    return rounds ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    System.out.println("input 3 sides (in m): ");
    int s1 = s.nextInt() ; 
    int s2 = s.nextInt() ;
    int s3 = s.nextInt() ;

    System.out.println(calc(s1, s2, s3));
  }
}
