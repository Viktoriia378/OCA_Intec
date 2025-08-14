package datesAndTimes;

import java.time.*;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        //The date and time classes are immutable

        LocalDate date = LocalDate.of(2014, Month.JANUARY,20);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        System.out.println("-------------");

        LocalDate date1 = LocalDate.of(2020,Month.JANUARY,20);
        LocalTime time = LocalTime.of(5,15);
        LocalDateTime dateTime = LocalDateTime.of(date1,time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10); //so 18 date
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        System.out.println("------------");

        LocalDate date2 = LocalDate.of(2020,Month.JANUARY,20);
        LocalTime time2 = LocalTime.of(5,15);
        LocalDateTime dateTime2 = LocalDateTime.of(date2,time2)
                .minusDays(1).minusHours(10).minusSeconds(30);
    }
}
