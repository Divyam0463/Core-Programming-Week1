import java.util.Scanner;

public class aaa_ {

  static int findY(int [] age){
    int min = 0 ; 

    for (int i = 0; i < age.length; i++) {
      if ( age[min] > age[i] ) {
        min = i ; 
      }
    }
    return min ; 
  }

  static int findT(int [] height){
    int max = 0 ; 

    for (int i = 0; i < height.length; i++) {
      if ( height[max] < height[i] ) {
        max = i ; 
      }
    }

    return max ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int []age = new int[3] ; 
    int []height = new int[3] ;

    String[] names ={"Amar" , "Akbar" , "Antony"} ; 

    for (int i = 0; i < height.length; i++) {
      System.out.print("Input age "+(i+1)+" :") ; 
      age[i] = s.nextInt() ; 
      System.out.print("Input height "+(i+1)+" :") ; 
      height[i] = s.nextInt() ; 
    }

    int max = findT(height) ;
    int min = findY(age) ; 

    System.out.println("Youngest: "+names[min]);
    System.out.println("Tallest: "+names[max]);
  }
}
