import java.util.Scanner ;
public class numbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    
    int [] arr = new int[5] ; 

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt() ; 
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        if (arr[i] %2 == 0) {
          System.out.println("even") ;
        }
        else{
          System.out.println("odd") ;
        }
      }
      else if (arr[i] <0 ) System.out.println("negative");

      else{
        System.out.println("zero");
      }
    }

    if (arr[0]<arr[4]) {
      System.out.println("Last element greater");
      return ;  
    }
    System.out.println("First element greater") ;
  }
}
