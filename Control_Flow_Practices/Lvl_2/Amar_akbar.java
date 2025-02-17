
import java.util.Scanner;

public class Amar_akbar {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    System.out.println("input Amar for age(in yrs) & height(in cms): ");

    int age1 = s.nextInt() ; 
    int height1 = s.nextInt() ; 

    System.out.println("input akbar for age(in yrs) & height(in cms): ");

    int age2 = s.nextInt() ; 
    int height2 = s.nextInt() ; 

    System.out.println("input antony for age(in yrs) & height(in cms): ");

    int age3 = s.nextInt() ; 
    int height3 = s.nextInt() ;     

    //finding youngest
    if (age1<age2 && age1<age3) {
      System.out.println("Amar is youngest with age: "+age1);
    }
    else if (age1>age2 && age2<age3) {
      System.out.println("akbar is youngest with age: "+age2);
    }
    else{
      System.out.println("antony is youngest with age: "+age3);
    }

    //finding tallest
    if (height1<height2 && height3<height2) {
      System.out.println("akbar is tallest with height: "+height2);
    }
    else if (height1>height2 && height3<height1) {
      System.out.println("Amar is tallest with height: "+height1);
    }
    else{
      System.out.println("antony is tallest with height: "+height3);
    }
  }
  
}
