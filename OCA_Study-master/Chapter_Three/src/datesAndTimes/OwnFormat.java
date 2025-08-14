package datesAndTimes;

import java.time.format.DateTimeFormatter;
import java.time.*;
public class OwnFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));

        /*
        MMMM - month
        dd - date in the month
        yyyy - year
        hh - hour
        :
        mm - minute
         */
    }
}
