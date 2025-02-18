import java.util.Arrays;
import java.util.Scanner;

public class small_large {
  static int[] findSmallestAndLargest(int[] nums){
    int small = Integer.MAX_VALUE ;
    int large = Integer.MIN_VALUE ; 

    int[] ans = new int[2] ; 
    
    for (int i = 0; i < nums.length; i++) {
      small = Math.min(small,nums[i]) ;
      large = Math.max(large, nums[i]) ; 
    }
    //storing the small and large values in a new array
    ans[0] = small ;
    ans[1] = large ;

    return ans;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    int [] nums = new int[3] ;
    
    for (int i = 0; i < 3; i++) {
      nums[i] = sc.nextInt() ; 
    }

    int[] ans = findSmallestAndLargest(nums) ; 
    System.out.println(Arrays.toString(ans));// printing it in the form of string
  }
}
