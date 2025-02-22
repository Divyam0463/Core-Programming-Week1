import java.text.SimpleDateFormat;
import java.util.* ; 
public class checkDate {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in) ; 

    System.out.println("enter dates in dd-mm-yyyy: ");
    String str1 = s.nextLine() ; 
    String str2 = s.nextLine() ; 

    s.close() ;

    try {
      SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy") ; 
      Date date1 = sdf.parse(str1)  ;
      Date date2 = sdf.parse(str2)  ;

      if (date1.after(date2)) {
        System.out.println("1st date comes after the 2nd one.");
      }
      else if (date1.before(date2)) {
        System.out.println("1st date comes before the 2nd one");
      }
      else if(date1.equals(date2)){
        System.out.println("both dates are equal.");
      }

    } catch (java.text.ParseException e) {
      System.err.println("Invalid date formats !");
    }
  }
}
