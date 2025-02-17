import java.util.* ; 

public class frequency {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    int num = s.nextInt(); 
    int cnt = 1 , k = 0; 

    String str = Integer.toString(num) ; 

    String arr[] = str.split("") ;
    int [] freq = new int[10] ; 

    for (int i = 0; i < arr.length; i++) {
      int digit = Integer.parseInt(arr[i]) ; 
      freq[digit]++ ; 
    }

    System.out.println(Arrays.toString(freq));
  }
}

