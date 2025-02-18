import java.util.Arrays;
import java.util.Scanner;

public class Number_3_Checker {

  static int findCount(int num) {
    int cnt = 0;
    while (num != 0) {
      num /= 10;
      cnt++;
    }
    return cnt;
  } 

  static int[] putNums(int cnt, int num) {
    int[] digits = new int[cnt];
    int i = 0;

    while (num != 0) {
      digits[i++] = num % 10;
      num /= 10;
    }
    return digits;
  }

  static int[] rev(int num , int[] digits){
     int [] rev = new int[digits.length] ;
     int k=0; 

     for (int i = digits.length - 1 ; i >= 0; i--) {
      rev[k++] = digits[i] ;  
     }

     return rev ; 
  }

  static boolean isEqual(int[] arr1 , int[] arr2){
    if (Arrays.equals(arr1, arr2)) return true ; 
    return false ; 
  }

  static boolean isPalindrome(int [] arr1 , int[] arr2){
    if (isEqual(arr1, arr2)) {
      return true ; 
    }
    return false ;
  }

  static boolean checkDuck(int [] digits){
    for (int i = 1; i < digits.length; i++) {
      if (digits[i] == 0) {
        return true ; 
      }
    }return false ;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int num = s.nextInt() ; 

    int[] arr = new int[findCount(num)] ; 
    arr = putNums(findCount(num), num) ; 
    int [] rev = rev(num, arr) ; 

    System.out.println("Count: " + findCount(num)) ;
    System.out.println(Arrays.toString(arr));
 
    System.out.println("Are both the arrays Equal: "+isEqual(arr, rev)) ;
    System.out.println("is the number palindrome?: "+isPalindrome(arr, rev));
    System.out.println("is it a duck number?: "+checkDuck(rev)) ;

    s.close();
  }
}
