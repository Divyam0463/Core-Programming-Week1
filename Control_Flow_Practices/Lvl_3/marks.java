import java.util.Scanner;

public class marks {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    
    System.out.println("Input physics: ");
    int p = s.nextInt() ; 

    System.out.println("Input chemistry: ");
    int c = s.nextInt() ; 

    System.out.println("Input maths: ");
    int m = s.nextInt() ; 

    double avg = (p+c+m) / 3.0 ;
    
    if (avg <= 39) System.out.println("Remedial Standards: R : "+avg+" %");
    
    else if(avg >= 40 && avg <= 49) System.out.println("Lvl1 : too below: E : "+avg+" %");

    else if(avg >= 50 && avg <= 59) System.out.println("Lvl1 : well below: D : "+avg+" %");
    else if(avg >= 60 && avg <= 69) System.out.println("Lvl2 : below but approaching: C : "+avg+" %");
    else if(avg >= 70 && avg <= 79) System.out.println("Lvl4 : at agency normalised: B : "+avg+" %");
    else if(avg >= 80 && avg <= 100) System.out.println("Lvl4 : above agency normalised: A : "+avg+" %");

    else{
      System.out.println("wrong avg calculated due to larger number of marks ! ");
    }
  }
}
