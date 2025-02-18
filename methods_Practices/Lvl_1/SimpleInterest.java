
public class SimpleInterest {
  static double calculateInterest(int p , double r, int t){
    double ans = p*r*t/100.0 ; 
    return ans ; 
  }

  public static void main(String[] args) {
    int p = 1000 ; 
    double r = 5.5 ; 
    int t = 2 ; 
    System.out.println("The Simple Interest is : "+ calculateInterest(p,r,t) +" for Principal " + p+" , Rate of Interest: "+ r+" and Time: "+t) ;
  }
}