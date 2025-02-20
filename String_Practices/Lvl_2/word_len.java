import java.util.Scanner;

public class word_len {
  static String[][] getArray(String str){
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

    return words;  
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ;
    String str = s.nextLine() ;  
    String[][] words =  getArray(str) ; 

      for ( String[] word : words ) {
          for ( int j = 0; j < 2; j++ ) {
            System.out.print(word[j] + " ") ; 
          }
          System.out.println();
      }

    s.close();
  }
}
