package ObjectsClasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex5 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        System.out.printf("Today is: %s", ld.toString() + "\n");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd" + "."+"LLLL"+"."+ "YYYY" + "(EEEE)");
        System.out.printf("Today is: %s\n",ld.format(dateTimeFormatter));

        ld = new LocalDate().minus(100);
    }
}
