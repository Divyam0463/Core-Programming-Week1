public class pnl {
  public static void main(String[] args) {
    int cost = 129 ; 
    int sell = 191 ; 

    double res = (double)(sell-cost)*100/cost; 
    String ans = String.format("%.2f" , res); //to formatt the decimal double to a string upto 2 decimal places 

    System.out.println("Profit: "+ans+" %");
  }
}
