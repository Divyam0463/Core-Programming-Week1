import java.util.Scanner;

public class leapYear {
  static boolean find(int year){
    if (year >= 1582 && year % 4 == 0) {
      if (year % 100 == 0 && year % 400 != 0) {
        
        return false;
      }
      
      return true;
    }
    return false ; 
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ; 
    int year = sc.nextInt() ; 

    System.out.println(find(year));
  }
}
