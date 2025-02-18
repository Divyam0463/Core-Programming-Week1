import java.util.Arrays;
import java.util.Random;

public class otp {
  static int[] GenerateOtp(){
    int [] nums = new int [10] ; 

    Random random = new Random(); //created an obj random of class Random
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (99999 + random.nextInt(900000)) ;
    }
    return nums ;
  }

  static boolean isUnique(int [] nums){
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[i] == nums[j]) return false; 
      }
    }
    return true ; 
  }
  public static void main(String[] args) {
    int [] nums = GenerateOtp() ; 
    System.out.println(Arrays.toString(nums));
    System.out.println("are the numbers unique ? :"+isUnique(nums));
  }
}
