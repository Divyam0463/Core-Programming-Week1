import java.util.Scanner;

public class rocket_launch {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in)  ;

    int num = s.nextInt() ; 

    while (num!=0) {
      if (num == 1) {
        System.out.println("its one: "+num);
        return;
      }
      System.out.println(num);
      num-- ;
    }
  }
}
