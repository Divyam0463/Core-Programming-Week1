
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rockpaper {
  static int cntP = 0;
  static int cntC = 0 ;

  static String enterMatch(String player){
    Random random = new Random() ; 
    String [] choices = {"rock" , "paper" , "scissor"} ; 

    int randomIdx = random.nextInt(choices.length) ;
    return choices[randomIdx] ;  
  }

  static void battle( String player , String compChoice ){ 

    if (player.equals(compChoice)) {
      System.out.println("its a tie"); 
    }

    else if (player.equals("rock") && compChoice.equals("scissor") ||
    player.equals("paper") && compChoice.equals("rock")||
    player.equals("scissor") && compChoice.equals("paper")) {
      cntP++ ; 
      System.out.println("you win!") ; 
    }else{
      cntC++ ;
      System.out.println("computer wins!") ; 
    } 
  }

  static double[] checkPercentage(int cntC , int cntP , int num){
    double user = (cntP *1.0/ num)  * 100 ; 
    double comp = (cntC *1.0/ num)  * 100 ;

    return new double[]{user , comp} ; 
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 
    System.out.print("How many games? : ");
    int num = s.nextInt() ;
    s.nextLine(); 

    for (int i = 0; i < num ; i++) {
      System.out.print("Enter yr move: ");
      String player = s.nextLine() ; 
      if (player.equals("rock") || player.equals("scissor") || player.equals("paper")) {
        enterMatch(player) ;
  
        String compChoice = enterMatch(player);
        System.out.println(compChoice);
  
        battle(player, compChoice);
      } else{
        System.out.println("invalid user input !");
      }
    }

    double [] result = checkPercentage(cntC, cntP , num) ;
    System.out.println("user and comp win ratio: "+Arrays.toString(result));

  }
}
