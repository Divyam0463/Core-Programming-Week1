import java.text.SimpleDateFormat;
import java.util.*;

public class date_formatter {
  public static void main(String[] args) {
    Date currdate = new Date() ;  
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ; 
    System.out.println("date in 1st format: "+sdf.format(currdate));

    sdf.applyPattern("yyyy-MM-dd"); //modify the simpleDateFormat
    System.out.println("date in 2nd format: "+sdf.format(currdate));

    sdf.applyPattern("EEE, MMM dd, yyyy");
    System.out.println("date in 3rd format: "+sdf.format(currdate));
  }
}
