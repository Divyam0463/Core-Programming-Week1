import java.util.Scanner;

public class number_positive {
  static void find(int number){
    if (number < 0) System.out.println(-1);
    else if(number == 0) System.out.println(0);
    else{
      System.out.println(1);
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Input number: ");
    int num = s.nextInt(); 
    find(num)  ;
  }
}
