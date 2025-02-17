import java.util.Scanner;

public class unitPrice {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in) ; 

    double unitPrice = s.nextInt() ; 
    int units = s.nextInt() ; 

    double totalPrice = unitPrice*units ; 

    System.out.println("The total purchase price is INR: "+totalPrice +" if the quantity: "+units + " and unit price is INR: "+unitPrice);
  }
}
