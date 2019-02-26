package DateTime.tanggal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class Ajuss {
    public static void adjustDate(){
        System.out.println("==============================================");
        System.out.println("PBI 3 - Temporal Adjuster");

        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);

        LocalDate with = date1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth : " + with);

        LocalDate with1 = date1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfMonth : " + with1);

        LocalDate with2 = date1.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("next monday : " + with2);

        LocalDate with3 = date1.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("firstDayOfNextMonth : " + with3);
        //get the next tuesday
        LocalDate nextFriday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next Friday on : " + nextFriday);

        String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
                "Friday", "Saturday" };

        Calendar now = Calendar.getInstance();
        System.out.println("Current day is : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
