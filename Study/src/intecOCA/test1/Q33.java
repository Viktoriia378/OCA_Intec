package intecOCA.test1;

import java.time.*;

public class Q33 {
    public static void main(String[] args) {
        LocalDateTime id = LocalDateTime.of(2015, Month.OCTOBER, 31,10,0);

        ZonedDateTime date = ZonedDateTime.of(id, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1)); //Adds 24 hours; DST rollback means 1 hour earlier
        System.out.println(date);

        date = ZonedDateTime.of(id, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
    }
}
/*
Important thing to remember here is that Period is used to manipulate dates in terms of days, months, and years,
while Duration is used to manipulate dates in terms of hours, minutes, and seconds.
Therefore, Period doesn't mess with the time component of the date while Duration may change
the time component if the date is close to the DST  boundary.
Durations and periods differ in their treatment of daylight savings time when added to ZonedDateTime.
A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours.
By contrast, a Period will add a conceptual day, trying to maintain the local time.
For example, consider adding a period of one day and a duration of one day to 18:00
on the evening before a daylight savings gap. The Period will add the conceptual day and result
in a ZonedDateTime at 18:00 the following day. By contrast, the Duration will add exactly 24 hours,
resulting in a ZonedDateTime at 19:00 the following day (assuming a one hour DST gap).
 */

/*
Rule of Thumb:
Use **Period** when you care about dates (e.g., scheduling something "tomorrow").
Use **Duration** when you care about exact time spans (e.g., wait 24 hours, regardless of calendar shifts).
 */