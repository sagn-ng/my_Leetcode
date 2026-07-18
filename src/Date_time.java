import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date_time {
    public static void main(String[] args) {
        LocalDate curr_Date=LocalDate.now(); //LocalDate class, now() method
        System.out.println(curr_Date); //display current date
        DateTimeFormatter mode1=DateTimeFormatter.ofPattern("E, dd-MM-yyyy");
        System.out.println("After formatted: "+curr_Date.format(mode1)); //formatted

        LocalTime curr_Time=LocalTime.now(); //LocalTime class
        System.out.println("\n"+curr_Time);
        mode1=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("After formatted: "+curr_Time.format(mode1));

        LocalDateTime curr_dt=LocalDateTime.now(); //LocalDateTime class
        System.out.println("\n"+curr_dt);
        mode1=DateTimeFormatter.ofPattern("E, dd-MM-yyyy, hh:mm:ss");
        System.out.println("After formatted: "+curr_dt.format(mode1));
    }
}
/*ofPattern() method để cài đặt format in ra
 */