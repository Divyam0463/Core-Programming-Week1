public class Univ {
  public static void main(String[] args) {
    long fees = 125000 ; 
    double discount = 10.0/100 * fees; //forcing the var to be double

    long discountedfees = fees - (long)discount ;
    
    System.out.println("The discount amount is INR: "+discount +" and final discounted fee is INR: "+discountedfees) ; 
  }
}
