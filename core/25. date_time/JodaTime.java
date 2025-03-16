import java.util.*;
import java.time.*;

public class JodaTime {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        LocalDate dt=LocalDate.now();
        System.out.println(dt);

        LocalDate dt2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt2);

        LocalDate dt3=dt2.plusMonths(6);
        System.out.println(dt3);

        // minusHours, minusDays, minusWeeks, minusMonths, minusYears
        
    }
}
