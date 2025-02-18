import java.util.Arrays;
import java.util.Scanner;

public class Number_5_checker {
  static int[] checkFactors(int num) {
    int cnt = 0;

    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        cnt++; 
      }
    }

    int[] factors = new int[cnt];
    int idx = 0 ; 

    for (int i = 1 ; i < num ; i++) {
      if (num % i == 0) {
        factors[idx++] = i ; 
      }  
    }

    return factors ; 
  }

  static int findGreatestFactor(int [] factors){
    return factors[factors.length - 1] ; 
  }

  static int findSum(int [] factors){
    int sum = 0 ; 
    for (int i = 0; i < factors.length ; i++) {
      sum += factors[i];
    } 
    return sum ; 
  }

  static int findPro(int [] factors){
    int pro = 1 ; 
    for (int i = 0; i < factors.length ; i++) {
      pro *= factors[i] ; 
    }return pro ;
  }

  static double findCube(int [] factors){
    double proCube = 0 ; 
    for (int i = 0; i < factors.length; i++) {
      proCube  = Math.pow( factors[i] , 3 ) ; 
    }return proCube ; 
  }

  static boolean findPerfect(int num,int sum){
    if (sum == num ) {
      return true ; 
    }return false ; 
  }

  static boolean findAbundant(int num,int sum){
    if (sum > num ) {
      return true ; 
    }else{
      return false ;
    } 
  }

  static boolean findDeficient( int num , int sum){
    if (sum < num ) {
      return true ; 
    }else{
      return false; 
    } 
  }

  static int fact(int n){
    if (n == 1) {
      return 1 ; 
    }
    return n*fact(n-1) ; 
  }

  static boolean findStrong(int num){
    int old = num ; 
    int sum = 0 , digit = 0;

    while (num != 0) { 
      digit = num%10 ; 
      sum += fact(digit) ;
      num /= 10; 
    }

    if (sum == old) {
      return true ; 
    }return false ; 
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt(); 
    
    int [] factors = checkFactors(num);

    System.out.println(Arrays.toString(checkFactors(num))) ;
    System.out.println("Greatest Factor: "+findGreatestFactor(factors)) ;
    System.out.println("Sum of factors: "+findSum(factors));
    System.out.println("Product of factors: "+findPro(factors));
    System.out.println("is it a perfect number? : "+findPerfect(num, findSum(factors)));
    System.out.println("is it an abundant number? : "+findAbundant(num, findSum(factors)));
    System.out.println("is it a deficient number? : "+findDeficient(num, findSum(factors)));
    System.out.println("is it a strong number? : "+findStrong(num));
    s.close();
  }
}
