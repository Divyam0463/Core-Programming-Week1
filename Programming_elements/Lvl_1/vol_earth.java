public class vol_earth {
  public static void main(String[] args) {
    double rad = 6378.0 ; 

    double vol = 4.0/3 * Math.PI * rad * rad * rad ; 
    double miles = vol * 0.621371 ;

    String ans =String.format("%.2f", vol) ;
    String ans_miles =String.format("%.2f", miles) ; 
    
    System.out.println("The volume of earth in cubic kilometers is: "+ ans +" and cubic miles is: "+ans_miles);
  }
}
