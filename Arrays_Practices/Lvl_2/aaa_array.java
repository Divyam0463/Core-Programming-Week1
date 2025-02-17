import java.util.Scanner;

public class aaa_array {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] arr = new int[3][2];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("enter the age "+(i+1)+" : ") ; 
      arr[i][0] = s.nextInt() ; 
      System.out.println("enter the height "+(i+1)+" : ") ; 
      arr[i][1] = s.nextInt() ; 
    }

    int minAge = arr[0][0] , minAns = 0 ;
    int maxHeight = arr[0][0], maxAns = 0  ; 

    for (int i = 0; i < arr.length; i++) {
      if (arr[i][0] < minAge) {
        minAge = arr[i][0] ;
        minAns = i ; 
      }

      if (arr[i][1] > maxHeight) {
        maxHeight = arr[i][1] ; 
        maxAns = i ; 
      }
    }

    System.out.println(minAns);
    System.out.println(maxAns);

  }
}
