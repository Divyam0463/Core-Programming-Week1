import java.util.Scanner;

public class GCD {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();

    System.out.println("GCD: " + calculateGCD(n1, n2));
    System.out.println("LCM: " + calculateLCM(n1, n2));
  }

  private static int calculateGCD(int n1, int n2) {
    int max = Math.max(n1, n2);
    int min = Math.min(n1, n2);

    if (min ==0 ) return max; 

    for (int i = Math.abs(max); i >= 1; i--) {
      if (Math.abs(max) % i == 0 && Math.abs(min) % i == 0 && i <= Math.abs(min)) {
        return i;
      }
    }
    return -1;
  }

  private static int calculateLCM(int n1 , int n2){
    return n1*n2/calculateGCD(n1, n2) ; //for 9 and 12 : 108 / 3 = 36
  }
}
