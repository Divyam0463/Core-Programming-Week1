import java.util.Arrays;
import java.util.Scanner;

public class longShortLen {
  static String[] getArray(String str){
    int cnt = 0 ;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        cnt++; 
      } 
    }cnt++ ;

    String [][] words = new String[cnt][2] ; 
    int k = 0 ;  
    String ans = "" ;

    for (int i = 0; i < str.length(); i++) { 
      char ch = str.charAt(i) ; 
      if (ch == 32) { 
        words[k++][0] = ans ; 
        ans = "" ;
      }
      else{
        ans += ch ; 
      }
    } 
    words[k++][0] = ans ; 

    for (String[] word : words) {
      word[1] = String.valueOf(word[0].length());
    }

    String maxStr = "" ; 
    int max = Integer.MIN_VALUE  ; 
    String minStr = "" ; 
    int min = Integer.MAX_VALUE  ;
    int j = 0 ; 

    for (String[] word : words) {
      int tempInt = Integer.parseInt(word[1]) ; // every length is stored here for every string
      
      if (min > tempInt) {
        min = tempInt ; 
        minStr = word[0] ; 
      }
      if (max < tempInt ) {
        max = tempInt ; 
        maxStr = word[0] ; 
      }
    }
    
    System.out.println("Greatest , Smallest: ") ;  
    return new String[]{maxStr , minStr} ;   
  }

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in) ; 
    String str = s.nextLine() ; 

    System.out.println(Arrays.toString(getArray(str)));

    s.close();
  }
}
