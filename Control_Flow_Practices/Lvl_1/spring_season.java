
import java.util.Scanner;


public class spring_season {
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in) ; 

    int month = s.nextInt() ; 
    int date = s.nextInt(); 

    if (month < 13) {
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
    else{
      System.out.println("Not a spring season");
    }
  }
}
