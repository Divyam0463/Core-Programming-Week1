import java.util.Scanner ;
public class age {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int [] arr = new int[10] ; 

    for(int i = 0 ; i<10 ; i++){
      arr[i] = s.nextInt() ; 
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i]>=18) System.out.println("can vote");
      else{
        System.out.println("Can't vote");
      } 
    }
  }
}