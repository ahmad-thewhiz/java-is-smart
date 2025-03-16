import java.time.*;

public class ZonedDemo {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("OffsetDateTime: " + offsetDateTime);
    
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId);
        System.out.println("ZonedDateTime2: " + zonedDateTime2);

        /*
         * ZonedDateTime
         * OffsetDateTime
         * OffsetTime
         * ZoneId
         * MonthDay
         * YearMonth
         * Year
         * Period   
         * Duration 
         * Instant
         */

    }
}
