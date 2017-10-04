package ObjectsClasses;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex5 {

    public static void main(String[] args) {
        /*
            ===========
               PART 1
            ===========
        */
        LocalDate today = LocalDate.now();
        System.out.printf("Today is: %s", today.toString() + "\n");

        /*
            ===========
               PART 2
            ===========
        */
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.LLLL.YYYY" + "(EEEE)");
        System.out.printf("%s\n", today.format(dateTimeFormatter));

         /*
            ===========
               PART 3
            ===========
        */
        LocalDate m100Days = today.minus(Period.ofDays(100));
        System.out.printf("%s of day %s\n", m100Days, m100Days.getDayOfWeek());

         /*
            ===========
               PART 4
            ===========
        */
        LocalDate programmersDay = LocalDate.ofYearDay(2017, 256);
        System.out.println("Programmer's day is on: " + programmersDay.toString());

        /*
            ===========
               PART 5       Finds the days between 2 dates in days
            ===========
        */
        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(1756, 1, 27),
                LocalDate.of(1791, 12, 5)));

         /*
            ==============
               FUN PART
            ==============
        */
        System.out.println(today.getEra());
    }
}
