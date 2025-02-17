import java.util.Scanner;

public class reverse_digits {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num = s.nextInt() ; 

    String str = Integer.toString(num) ; 
    String[] arr = str.split("") ; 


    for (int i = arr.length - 1; i >=0; i--) {
      System.out.print(arr[i]+" ");
    }
  }
}
