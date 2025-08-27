package datesAndTimes;

import java.time.*;
import java.util.*;

public class CreatingExample {
    public static void main(String[] args) {
        //LocalDate - only date - no time, time zone (bv your Bday)
        //LocalTime - only time - system clock's current time(no time zone)
        //LocalDateTime - date and time - no time zone
        // we create them without keyword new

        System.out.println("Date: " + LocalDate.now()); //2025-08-14
        System.out.println("Date and time: "+LocalDateTime.now());//2025-08-14T10:46:37.541331900
        System.out.println("Time: "+LocalTime.now());//10:46:37.541331900

        //now() - static method
        //month comes before the date
        //T - between date and time

        System.out.println("Creating date: ");
        //public static LocalDate of(int year, int month, int dayOfMonth)
        //public static LocalDate of(int year, Month month, int dayOfMonth)
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015,1,20);

        System.out.println("Creating time: ");

        //we can specify just the hour and minute (int hour, int minute)
        // or add the number of seconds (int hour, int minute, int seconds)
        // or add nanoseconds (int hour, int minute, int seconds, int nanos)

        LocalTime time1 = LocalTime.of(6,15);
        LocalTime time2 = LocalTime.of(6,15,30);
        LocalTime time3 = LocalTime.of(6,15,30,200);

        System.out.println("Creating date and time: ");

        LocalDateTime dateTime1 = LocalDateTime.of(2015,Month.JANUARY,20,6,15,30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1); //we can add inside LocalDate and LocalTime

        //another combination:
        /*
        (int year, int month, int dayOfMonth, int hour, int minute)
        (int year, int month, int dayOfMonth, int hour, int minute, int second)
        (int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
        (int year, Month month, int dayOfMonth, int hour, int minute)
        (int year, Month month, int dayOfMonth, int hour, int minute, int second)
        (int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
        (LocalDate date, LocalTime)
         */

        //The date and time classes have private constructor
        //LocalDate d = new LocalDate(); - does not compile

        //if we use not correct datum we will get DateTimeException - (bv 32 date)

        System.out.println("Old way: ");
        Date d = new Date();

    }
}
