import java.time.*;
import java.time.format.*;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date time: " + formattedDateTime);
    
    }
}
