
import java.util.Scanner;

public class num_pos_neg_zero {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in) ; 
  int num = s.nextInt() ; 

  if (num>0) 
    System.out.println("Positive");
  
  else if (num < 0) 
    System.out.println("negative");
  
  else{
    System.out.println("zero");
  }
 } 
}
