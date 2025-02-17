
import java.util.Scanner;

public class Univ_Input {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;
    long fee = s.nextLong() ; 
    float discount = s.nextFloat() ; 

    double discountAmount = (discount/100) * fee ; 

    System.out.println("The discount amount is INR: "+ discountAmount+" and final discounted fee is INR: "+ (fee-discountAmount));
  }
}
