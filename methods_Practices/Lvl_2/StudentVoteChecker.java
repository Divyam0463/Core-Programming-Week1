
import java.util.Scanner;

public class StudentVoteChecker {
  public static boolean canStudentVote(int age) {
    if (age<0) return false ; 
    if (age>=18) {
      return true ; 
    }return false ;
  }
  public static void main(String[] args) {
    int[] arr = new int[10]; 

    Scanner s = new Scanner(System.in) ; 
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt() ; 
      
    }
    
    for (int i = 0; i < arr.length; i++) {
      boolean ans = canStudentVote(arr[i]);
      System.out.print(ans+" ");
    }
  }
}
