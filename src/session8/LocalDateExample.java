package session8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.err.println("CurrentDate  : " + currentDate);
        LocalDate specificDate  =LocalDate.of(2019, Month.AUGUST, 1);
        System.err.println("specificDate  : " + specificDate);
        LocalDate  todayHCM  = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.err.println("today in HCM : " + todayHCM);
        LocalDate  todayJapan  = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.err.println("today in Japan : " + todayJapan);
        LocalDate dateFromBaseDate = LocalDate.ofEpochDay(34324);
        System.err.println("dateFromBaseDate  : " + dateFromBaseDate);

        LocalTime now = LocalTime.now();
        System.err.println("Current Time "+ now);
        LocalTime  timeHCM  = LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.err.println("time in HCM : " + timeHCM);
        LocalTime  timeJapan  = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.err.println("time in Japan: " + timeJapan);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.err.println("current localDateTime "+ localDateTime);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2014,10,2);
        Period period = Period.between(localDate2, localDate1);
        int days = period.getDays();
        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.of(2014,10,1,1,1,1));
//        DateTimeFormatter.ofPattern()


    }
}
