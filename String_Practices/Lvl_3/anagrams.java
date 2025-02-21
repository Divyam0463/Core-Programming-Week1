import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str1 = s.nextLine() ;
    String str2 = s.nextLine() ;
    
    System.out.println("Are they anagrams? : "+checkAnagram(str1,str2));
        s.close();
      }
    
      private static boolean checkAnagram(String str1,String str2) {
        if (str1.length() != str2.length()) {
          return false ;
        }

        int [] freq1 = new int[str1.length()] ; 
        char [] c1 = str1.toCharArray() ; 

        int [] freq2 = new int[str2.length()] ; 
        char [] c2 = str2.toCharArray() ;

        for (int i = 0; i < c1.length; i++) {
          
          if (c1[i] != '0' ) {
            freq1[i] = 1 ; 
            for (int j = i+1; j < c1.length; j++) {
              if (c1[i] == c1[j]) {
                freq1[i]++ ;
                c1[j] = '0' ; 
              }
            }
          } 
        }
  
        for (int i = 0; i < c2.length; i++) {
          
          if (c2[i] != '0' ) {
            freq2[i] = 1 ; 
            for (int j = i+1; j < c2.length; j++) {
              if (c2[i] == c2[j]) {
                freq2[i]++ ;
                c2[j] = '0' ; 
              }
            }
          } 
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2); 

        if (Arrays.equals(freq1 , freq2)) {
          return true ; 
        }return false ;
      }
}
