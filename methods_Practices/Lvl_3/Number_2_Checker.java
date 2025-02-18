import java.util.*;

public class Number_2_Checker {
  static int findCount(int num) {
    int cnt = 0;
    while (num != 0) {
      num /= 10;
      cnt++;
    }
    return cnt;
  }

  static int[] putNums(int cnt, int num) {
    int[] digits = new int[cnt];
    int i = 0;

    while (num != 0) {
      digits[i++] = num % 10;
      num /= 10;
    }
    return digits;
  }

  

  static boolean checkHarshad(int num) {
    int sum = 0;
    int old = num;

    while (num != 0) {
      sum += num % 10;
      num /= 10;
    }

    if (old % sum == 0) {
      return true;
    }
    return false;
  }

  static int sum(int[] digits) {
    int sum = 0;
    for (int i = 0; i < digits.length; i++) {
      sum += digits[i];
    }

    return sum;
  }

  static double sumSquares(int[] digits) {
    double sumSq = 0;
    for (int i = 0; i < digits.length; i++) {
      sumSq += Math.pow(digits[i], 2);
    }

    return sumSq;
  }

  static void CalCfreq(int num) {
    String numStr = String.valueOf(num) ; //coverting num integer to string..
    int numLen = numStr.length() ; //storing the length of the string

    int[][] freq = new int[10][2]; // Array declared

    for (int i = 0; i < 10; i++) {
      freq[i][0] = i ;  
      freq[i][1] = 0 ; //initially 0
    }

    for (int i = 0; i < numLen; i++) {
      char c = numStr.charAt(i) ; //first -> 2 for e.g = 23
      int digit = Character.getNumericValue(c) ; //getting char value in the form of an Integer
      freq[digit][1] += 1 ; //adding count to its adjacent freq index
    }

    for (int i = 0; i < freq.length; i++) {
      if (freq[i][1] > 0) {
        System.out.print("digit: "+freq[i][0]+" freq: "+freq[i][1]);
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num = s.nextInt();

    System.out.println("No. of digits: " + findCount(num));
    int[] digits = new int[findCount(num)]; // setting length with the returning value of findCnt() ..

    digits = putNums(findCount(num), num);

    System.out.println(Arrays.toString(digits));
    System.out.println("Is it a harshad number?: "+checkHarshad(num));
    System.out.println("Sum: "+sum(digits));
    System.out.println("Sum of Squares: "+sumSquares(digits));

    CalCfreq(num);

    s.close();
  }
}
