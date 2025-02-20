import java.util.Scanner;

public class length {
  static void checkLen(String str){
    int cnt = 0 ; 
    try {
      for (int i = 0; i < Integer.MAX_VALUE; i++) {
        if (str.charAt(i) == ' ') {
          break ;  
        }
        cnt++ ; 
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("max length reached: "+e.getMessage());
    }System.out.println("Length using user-defined: "+cnt);
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.next(); 
    
    checkLen(str);
    System.out.println("\nLength using in-built: "+str.length());
  }
}
