import java.text.SimpleDateFormat;
import java.util.*;

public class date_arithmetic {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("Enter the date in dd-mm-yyyy: ");
    String str = s.nextLine() ;
    
    try {

      SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy") ; 
      Date currdate = sdf.parse(str) ; //parse - check the input 

      Calendar cal = Calendar.getInstance() ; 
      cal.setTime(currdate);//setting calendar acc to the input date

      cal.add(Calendar.DAY_OF_YEAR , 7) ; //adding 7 days
      cal.add(Calendar.MONTH , 1) ; // adding 1 month 
      cal.add(Calendar.YEAR , 2) ; // adding 2 years

      cal.add(Calendar.DAY_OF_YEAR, -21); // subracting 3 weeks

      Date resDate = cal.getTime() ; 
      String formattedDate = sdf.format(resDate) ;   
      System.out.println("resultant date is: "+formattedDate);

    } catch (java.text.ParseException e) {
      
      System.err.println("Invalid date input...");
    }
  }
}
