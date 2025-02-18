import java.util.* ; 
public class NumberChecker {
  static int findCount(int num){
    int cnt = 0 ; 
    while (num != 0 ) {
      num/=10 ; 
      cnt++ ; 
    }
    return cnt ; 
  }

  static int[] putNums( int cnt,int num){ 
    int[] digits = new int[cnt] ; 
    int i = 0 ; 

    while (num!=0) {
      digits[i++] = num%10 ;
      num /= 10 ;  
    }
    return digits ; 
  }

  static boolean checkDuck(int [] digits){
    for (int i = 1; i < digits.length; i++) {
      if (digits[i] == 0) {
        return true ; 
      }
    }return false ;
  }

  static boolean checkArmstrong(int num){
    int sum = 0 ;
    int old = num ; 

    while (num != 0) {
      sum += Math.pow((num%10), 3) ; 
      num /= 10 ;       
    }

    if (sum == old) {return true;}
    return false ;
  }

  static void largestAndsecondLar(int [] digits){
    int lar = Integer.MIN_VALUE ; 
    int second_lar = Integer.MIN_VALUE ; 

    for (int i = 0; i < digits.length; i++) {
      lar = Math.max( lar , digits[i] ) ;
    }

    for (int i = 0; i < digits.length; i++) {
      if (digits[i] < lar) {
        second_lar = Math.max( second_lar , digits[i] ) ; 
      }
    }

    System.out.println("largest : "+lar) ; 
    System.out.println("Second largest : "+second_lar) ;
  }

  static void smallestAndsecond(int [] digits){
    int small = Integer.MAX_VALUE ; 
    int second_small = Integer.MAX_VALUE ; 

    for (int i = 0; i < digits.length; i++) {
      small = Math.min( small , digits[i] ) ;
    }

    for (int i = 0; i < digits.length; i++) {
      if (digits[i]>small) {
        second_small = Math.min(second_small , digits[i]) ; 
      }
    }

    System.out.println("Smallest : "+small) ; 
    System.out.println("Second smallest : "+second_small) ;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num = s.nextInt() ;  

    System.out.println("No. of digits: "+findCount(num));
    int [] digits = new int[findCount(num)] ; // setting length with the returning value of findCnt() ..

    digits = putNums( findCount(num) , num);

    System.out.println(Arrays.toString(digits));
    System.out.println("Is it a duck Number ?: "+checkDuck(digits));
    System.out.println("Is it a Armstrong number ?: "+checkArmstrong(num));

    largestAndsecondLar(digits);
    smallestAndsecond(digits);

    s.close();
  }
}