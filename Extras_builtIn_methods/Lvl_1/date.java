import java.text.SimpleDateFormat ;
import java.util.*;

public class date {

  public static void main(String[] args) {
    Date currdate = new Date() ; 
    SimpleDateFormat dateFormat = new SimpleDateFormat() ; 

    String currdateTime = dateFormat.format(currdate) ; 
    System.out.println("Indian Standard time: "+currdateTime);

    //greenwich time
    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT")); //changing timezone to GMT
    System.out.println("Greenwich time: "+dateFormat.format(currdate));

    //pacific time
    dateFormat.setTimeZone(TimeZone.getTimeZone("PST"));
    System.out.println("Pacific time: "+dateFormat.format(currdate));
    
  }
}