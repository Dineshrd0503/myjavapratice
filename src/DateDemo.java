import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateDemo {
    public static void main(String[] args) {
        LocalDate currentdate=LocalDate.now();
        System.out.println("Current date is "+currentdate);
        LocalTime currenttime=LocalTime.now();
        System.out.println("Current time is "+currenttime);
        LocalDateTime currentdatetime=LocalDateTime.now();
        System.out.println("Current datetime is "+currentdatetime);
        ZonedDateTime zonetime=ZonedDateTime.now();
        System.out.println("Current datetime in UTC is "+zonetime);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentdate.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);
        
    }
    
}
