import java.util.* ; 

class Unit_Converter {
  public static double convertYardsToFeet(double yards)  {
    return yards*3 ; 
  }

  public static double convertFeetToYards(double feet)  {
    return feet/3 ; 
  }

  public static double meters2inches(double meters)  {
    return meters * 39.370 ; 
  }

  public static double inches2meters(double inches)  {
    return inches * 0.0254 ; 
  }

  public static double inches2cm(double inches)  {
    return inches * 2.54 ; 
  }
}

public class main_distance extends Unit_Converter{
public static void main(String[] args) {
  Scanner s = new Scanner(System.in) ; 

  System.out.println("Input distance in yards: ");
  double dist = s.nextDouble() ; 
  System.out.println("in feet: "+ convertYardsToFeet(dist));

  System.out.println("input distance in feet: ");
  double dist2 = s.nextDouble() ; 
  System.out.println("in yards: "+ convertFeetToYards(dist2));

  System.out.println("input distance in meters: ");
  double dist3 = s.nextDouble() ; 
  System.out.println("in inches: "+ meters2inches(dist3)) ;  

  System.out.println("input distance in inches: ");
  double dist4 = s.nextDouble() ; 
  System.out.println("in meters: "+ inches2meters(dist4)) ;
  System.out.println("in cms: "+ inches2cm(dist4)) ; 
}
}
