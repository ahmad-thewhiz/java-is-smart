import java.sql.Time;
import java.util.*;

public class CalenderDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.YEAR));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.HOUR));
        System.out.println(gc.get(Calendar.MINUTE));
        System.out.println(gc.get(Calendar.SECOND));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println(gc.get(Calendar.WEEK_OF_YEAR));
        System.out.println(gc.get(Calendar.AM_PM));
        System.out.println(gc.get(Calendar.HOUR_OF_DAY));

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());

    }
}