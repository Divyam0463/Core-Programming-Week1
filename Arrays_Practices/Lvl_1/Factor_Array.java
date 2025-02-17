import java.util.*; 

public class Factor_Array {
  public static void main(String[] args) {
    Scanner s =  new Scanner(System.in) ; 

    int num = s.nextInt() ; 
    int maxFactor = 10 ; 

    int [] arr = new int[maxFactor] ;
    int idx = 0 ; 
    
    for (int i = 1; i <= num; i++) { //loop till the number input 
      if (num % i == 0) { 
        if (idx == maxFactor) { //reached the end of the current length
          maxFactor *= 2 ;  //maxfactor is 20 now
          int [] temp = Arrays.copyOf(arr, arr.length) ;  //the arr is stored in temp array 
          arr = new int[maxFactor] ; //old array declared with new length
          System.arraycopy(temp, 0, arr, 0, temp.length); //arr is copied with elements of temp array and with twice the length now..
        }
        arr[idx++] = i ; 
      }
    }

    for (int i = 0; i < idx ; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
