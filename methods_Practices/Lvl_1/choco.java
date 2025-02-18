import java.util.Arrays;
import java.util.Scanner;

public class choco {
  static int[] find(int M, int N){
    int [] ans = new int[2] ; 

    ans[0] = M % N ; 
    ans[1] = M / N ; 

    return ans; 
  } 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("input chocolates: ");
    int M = s.nextInt() ; 
    System.out.println("input children: ");
    int N =s.nextInt() ; 

    int[] ans = find(M, N) ; 

    System.out.println("remaining and Each Chocolates: ");
    System.out.println(Arrays.toString(ans));
  }
}
