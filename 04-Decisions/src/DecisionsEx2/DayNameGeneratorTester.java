package DecisionsEx2;

import java.time.LocalDate;
import java.util.Scanner;

public class DayNameGeneratorTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        DayNameGenerator dng = new DayNameGenerator(day, month, year);
        String dayName = dng.getDayOfWeek();
        if (dayName != null) {
            System.out.println(dng.getDayOfWeek());

            System.out.println("Expected: " + LocalDate.of(year, month, day).getDayOfWeek());
        } else {
            System.err.println("Invalid date");
        }
    }
}
