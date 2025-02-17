
import java.util.Scanner;


public class checkSum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 
    int sum = 0 ;
    int sumN = 0 ; 

    if (num >= 0) {
      sumN = num*(num+1)/2 ; 

      while (num!=0) {
        sum += num ;
        num--; 
      }

      if (sumN == sum) {
        System.out.println(sumN+" and "+sum+ " are equal.");
      }
    }
    else{
      System.out.println(num+" is not a natural number.");
    }

  }
}
