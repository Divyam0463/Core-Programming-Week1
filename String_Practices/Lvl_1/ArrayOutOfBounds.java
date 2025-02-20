import java.util.Scanner;

public class ArrayOutOfBounds {
  static void generateException(int [] arr){
    try {
      System.out.println(arr[99]);
    } catch (ArrayIndexOutOfBoundsException e) {
      // TODO: handle exception
      System.err.println("Index outOFBounds for arr: "+e.getMessage());
    }
  }
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in) ; 
    int len = s.nextInt() ; 

    int [] arr = new int[len] ; 
    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.nextInt() ; 
    }

    generateException(arr) ; 
  }
}
