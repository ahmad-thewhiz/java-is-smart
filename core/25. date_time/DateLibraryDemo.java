import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateLibraryDemo {
    public static void main(String[] args) {
        // Using the old Date class
        System.out.println("Using java.util.Date:");
        Date currentDate = new Date();
        System.out.println("Current Date and Time: " + currentDate);

        // Formatting Date
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormatter.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        // Getting specific parts of the date
        System.out.println("Time in Milliseconds since Epoch: " + currentDate.getTime());

        // Using java.time.LocalDate
        System.out.println("\nUsing java.time.LocalDate:");
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        LocalDate specificDate = LocalDate.of(2025, 1, 8);
        System.out.println("Specific Date: " + specificDate);

        // Using java.time.LocalTime
        System.out.println("\nUsing java.time.LocalTime:");
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime specificTime = LocalTime.of(14, 30, 45);
        System.out.println("Specific Time: " + specificTime);

        // Using java.time.LocalDateTime
        System.out.println("\nUsing java.time.LocalDateTime:");
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, 1, 8, 14, 30, 45);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Formatting LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);

        // Parsing DateTime from String
        String dateTimeString = "08-01-2025 14:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormatter);
        System.out.println("Parsed LocalDateTime from String: " + parsedDateTime);
    }
}
