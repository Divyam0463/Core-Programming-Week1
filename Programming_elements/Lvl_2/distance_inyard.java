import java.text.DecimalFormat;
import java.util.Scanner;

public class distance_inyard {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    DecimalFormat df = new DecimalFormat("0.0");

    long distanceInfeet = s.nextInt();

    double distanceYard = distanceInfeet / 3.0;

    double distanceInMile = distanceYard / 1760.0;

    System.out.println("Your Height in feet is: " + df.format(distanceInfeet) + " while in yards is: "
        + df.format(distanceYard) + " and miles is: " + distanceInMile);

  }
}
