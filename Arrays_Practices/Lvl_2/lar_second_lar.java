import java.util.Scanner;

public class lar_second_lar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int n = s.nextInt() ; 

    if (n <= 1) {
      System.out.println("input of 2 or more elements in the array..."); 
      return ; 
    }
    int [] arr = new int[n] ; 

    for (int i = 0; i < n; i++) {
      arr[i] =  s.nextInt(); 
    }

    int lar = arr[0] ; 
    int second_lar = arr[0] ; 

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > lar ) {
        lar = arr[i] ; 
      }

      if (arr[i] > second_lar && arr[i] < lar) {
        second_lar = arr[i] ; 
      }
    }
    System.out.println("largest : "+lar) ; 
    System.out.println("Second largest : "+second_lar) ; 
  }
}
