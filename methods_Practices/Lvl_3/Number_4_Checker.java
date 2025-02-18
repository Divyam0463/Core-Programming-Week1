
import java.util.Scanner;

public class Number_4_Checker {
  static boolean isPrime(int num){
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i  == 0 ) return false ; 
    }return true ; 
  }

  static boolean isNeon(int num){
    int sumSq = 0 ;
    double Square = Math.pow( num%10 , 2 ); //81

    while ((int)Square != 0) {
      sumSq += (int)Square % 10 ; 
      Square /= 10 ; 
    }

    if (sumSq == num) return true ;
    return false ;
  }

  static boolean isSpy(int num){
    int sum = 0 ; 
    int pro = 1; 

    while (num != 0) {
      sum += num%10 ; 
      pro*=num%10 ;

      num /= 10 ; 
    }

    if(sum == pro) return true ; 
    return false; 
  }

  static boolean isAuto(int num){
    double sq = Math.pow( num, 2 ) ;
    
    if (sq % 10 == num ) return true ; 
    return false ;
  }

  static void isBuzz(int num){
    if (num % 7 == 0 || num % 10 == 7) System.out.println("its a buzz number.");
    else{
      System.out.println("its not buzzy");
    }
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 

    int num = s.nextInt() ; 
    System.out.println("Is it a prime number? : " + isPrime(num));
    System.out.println("Is it a neon number? : " + isNeon(num));
    System.out.println("Is it a Spy number? : " + isSpy(num));
    System.out.println("Is it an automorphic number? : " + isAuto(num));

    isBuzz(num);

    s.close();
  }
}
