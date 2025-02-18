
import java.util.Scanner;

public class Spring_Sea {

  static void calc( int month,int date ){
      if ( (month > 3 && month < 6) ) 
        System.out.println("Spring season");
      
      else if (month==3 && date >= 20) 
          System.out.println("Spring season");
      
      else if (month==6 && date <= 20) 
        System.out.println("Spring season");
      
      else{
        System.out.println("Not a spring season");
      }
    
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    System.out.println("input month : ");

    int month = s.nextInt() ; 
    if (month >= 13) {
      System.out.println("Not a spring season");
      return;
    }

    System.out.println("input date : ");
    int date = s.nextInt() ; 

    calc(month, date);
  }
}