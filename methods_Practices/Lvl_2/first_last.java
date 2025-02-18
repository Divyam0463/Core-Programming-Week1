import java.util.*; 

public class first_last {
  static void isPositive(int num){
    if (num>=0) {
    System.out.println("Its positive.");
    isEven(num) ;
  }
    else if(num<0) System.out.println("negative");
  }

  static void isEven(int num){
    if (num%2 == 0)System.out.println("even");
    else{
      System.out.println("Odd");
    }
  }

  static void compare(int num1 , int num2){
    if (num1>num2) System.out.println("First element is greater than the last..");
    else if (num1<num2) System.out.println("Last element is greater ..");
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int [] nums = new int[5]; 

    for (int i = 0; i < nums.length; i++) {
      nums[i]= s.nextInt() ;
      isPositive(nums[i]); 
    }

    compare(nums[0], nums[nums.length-1]);
  }
}
