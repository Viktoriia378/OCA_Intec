package datesAndTimes;

import java.time.*;

public class Periods {
    public static void main(String[] args) {
    //Period represents a date-based amount of time (years, months, days).

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); //How much time to jump forward each time

        toysForAnimals(start,end,period); //Hey, zoo keeper, from the start date to the end date, every 1 month, give the animals a new toy
    }

    private static void toysForAnimals(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start; //upTo starts at 2015-01-01
        while (upTo.isBefore(end)) { //Check if upTo is before end (2015-03-30)
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

    //we can not do chaining for Period. example: Period wrong - Period.ofYears(1).ofWeeks(1); it compiles but shows only week

    /*Period wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong); // P7D  (just 1 week!)
     */
}
