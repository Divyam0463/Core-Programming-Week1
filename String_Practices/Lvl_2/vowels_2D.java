import java.util.Scanner;

public class vowels_2D {
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

  static String[][] checkVowel(String str){
    String[][] temp = new String[str.length()][2] ; 

    for (int i = 0; i < temp.length; i++) {
      char ch = str.charAt(i) ; 
      if (ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch =='u') {
        temp[i][0] = String.valueOf(ch) ; 
        temp[i][1] = "vowel" ; 
      }
      else if(!(ch >= 'a' && ch <='z')){
        temp[i][0] = String.valueOf(ch) ; 
        temp[i][1] = "Not a letter" ; 
      }
      else{
        temp[i][0] = String.valueOf(ch) ; 
        temp[i][1] = "Consonant" ; 
      }
    }
    
    return temp ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    String str = s.nextLine() ; 

    System.out.println(convert(str));
    String[][] ans = checkVowel(convert(str));

    for (String[] word : ans) {
      System.out.print("char : "+word[0]+" , ");
      System.out.print("type : "+word[1]+" \n");
    }
    s.close();
  }
}
