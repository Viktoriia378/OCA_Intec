package datesAndTimes;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        //DateTimeFormatter - format any type of date and/or time object(java.time.format)

        LocalDate date2 = LocalDate.of(2020,Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11,12,34);
        LocalDateTime dateTime = LocalDateTime.of(date2,time);
        System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        /*
        DateTimeFormatter.ISO_LOCAL_DATE → prints as YYYY-MM-DD (2020-01-20)
        DateTimeFormatter.ISO_LOCAL_TIME → prints as HH:MM:SS (11:12:34)
        DateTimeFormatter.ISO_LOCAL_DATE_TIME → prints as YYYY-MM-DDTHH:MM:SS (2020-01-20T11:12:34)

        if it does not match we will get DateTimeException

        -toString() for LocalDate, LocalTime, and LocalDateTime uses ISO_LOCAL_DATE, ISO_LOCAL_TIME, ISO_LOCAL_DATE_TIME internally.
        -format() lets you override that with custom patterns
         */

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(date));
        //System.out.println(
        //shortDateTime.format(time)); UnsupportedTemporalTypeException - a time cannot be formatted as a date

        DateTimeFormatter shortDateTime2 =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime2));
        System.out.println(date.format(shortDateTime2));
        System.out.println(time.format(shortDateTime2)); //UnsupportedTemporalTypeException - a time cannot be formatted as a date

        //There are two predefi ned formats that can show up on the exam: SHORT and MEDIUM.

    }
}
