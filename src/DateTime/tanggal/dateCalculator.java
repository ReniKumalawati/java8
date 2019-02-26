package DateTime.tanggal;

import java.time.*;

import static java.lang.Math.abs;

public class dateCalculator {
    public static void calculateDiff(String bDate) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.parse(bDate);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.parse("00:00:00");
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.parse(bDate+ "T" + time2);

        System.out.println("Today is: " + date1);
        System.out.println("current time:" + time1);
        System.out.println("Your BirthDate: "+date2);

        Period gapPeriod = (Period) Period.between(date1,date2);
        Duration gapDuration = Duration.between(localDateTime1, localDateTime2);
        System.out.println("Gap between your birthdate and today is: " + abs(gapPeriod.getYears()) + " year " + abs(gapPeriod.getMonths()) + " month " + abs(gapPeriod.getDays()) + " days " + abs(gapDuration.toHours()) + " hours " + abs(gapDuration.toMinutes()) + " minutes ");
        System.out.println();
    }
}
