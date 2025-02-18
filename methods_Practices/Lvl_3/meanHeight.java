
import java.util.*;

public class meanHeight {
  static int findSum(int [] arr){
    int sum  =0  ; 
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i] ; 
    }
    return sum ; 
  }//sum 

  static double meanHeight(int [] arr , int sum){
    double meanHeight = sum / 11 ;
    return  meanHeight ; 
  }

  static int shortestHeight(int [] arr ){
    int min = Integer.MAX_VALUE ;

    for (int i = 0; i < arr.length; i++) {
      min = Math.min(min , arr[i]) ; 
    }
    return min ;  
  }

  static int tallest(int [] arr ){
    int max = Integer.MIN_VALUE ;

    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max , arr[i]) ; 
    }
    return max ;  
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;  

    int [] height = new int[11] ;
    Random random = new Random() ; 

    for (int i = 0; i < height.length; i++) {
      height[i] = random.nextInt(150,250) ; 
      System.out.print(height[i]+" ");
    }


    System.out.println("\nSum: "+findSum(height));
    System.out.println("Mean-Height: "+meanHeight(height,findSum(height)));
    System.out.println("Shortest: "+shortestHeight(height));
    System.out.println("Tallest: "+tallest(height));
  } 
}
