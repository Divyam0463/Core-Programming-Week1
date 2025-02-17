import java.util.Scanner;

public class Vote_age {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    int age = s.nextInt() ; 

    String ans = (age>=18)?"The person's age is: "+age+" and can vote.":"The person's age is: "+age+" and cannot vote." ; 

    System.out.println(ans);
  }
}
