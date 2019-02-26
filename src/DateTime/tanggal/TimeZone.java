package DateTime.tanggal;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void showTimeZone(){
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("==============================================");
        System.out.println("PBI 1 - TimeZone");
        System.out.println("current Time Zone is "+ currentZone.getZone() + "   " + currentZone.toLocalTime());
        ZoneId majalengka = ZoneId.of("Asia/Jakarta");
        ZonedDateTime Zone2 = currentZone.withZoneSameInstant(majalengka);
        System.out.println("Zona Majalengka: " + Zone2.toLocalTime());
    }
}
