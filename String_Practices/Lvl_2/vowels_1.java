import java.util.Arrays;
import java.util.Scanner;

public class vowels_1 {
  static String convert(String str){
    String ans = "" ; 
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i) ; 

      if ( ch >= 'A' && ch <= 'Z' ) {
        ans += (char)(ch +32) ; 
      }else{
        ans += ch ; 
      }
    }return ans ; 
  }

  static String[] checkVowel(String str){
    String[] temp = new String[str.length()] ; 

    int cnt = 0 , cnt2 = 0 ; 

    for (int i = 0; i < temp.length; i++) {
      char ch = str.charAt(i) ; 
      if (ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch =='u') {
        temp[i] = "vowel" ; 
        cnt++ ;  
      }
      else if(!(ch >= 'a' && ch <='z')){
        temp[i] = "Not a letter" ; 
      }
      else{
        temp[i] = "Consonant" ; 
        cnt2++ ; 
      }
    }
    System.out.println("Vowel cnt: "+cnt);
    System.out.println("Consonant cnt: "+cnt2);
    return temp ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.nextLine() ; 

    System.out.println(convert(str));
    System.out.println(Arrays.toString(checkVowel(convert(str))));

    s.close();
  }
}
