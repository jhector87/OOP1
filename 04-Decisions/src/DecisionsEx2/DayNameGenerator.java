package DecisionsEx2;

public class DayNameGenerator {

    private int day, month, year;

    private static final int MONTHS_IN_YEAR = 12;
    private static final int CUTOVER_YEAR = 1582;


    public DayNameGenerator(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String getDayOfWeek() {
        return isValidDate() ?
         getNameOfDay((getFirstDayOfWeek() + day - 1) % 7) : null;
    }

    private boolean isValidDate(){
        return day > 0 && day <= getLengthOfMonth()
                && month > 0 && month <= MONTHS_IN_YEAR
                && year > CUTOVER_YEAR;
    }

    private int getLengthOfMonth(){
        int lastDay = 0;
        switch (month) {
            case 2:
                lastDay = isLeapYear() ? 29 : 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 11;
                break;
        }
        return lastDay;
    }

    private boolean isLeapYear(){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private int getFirstDayOfWeek() {
        return (700 + (26 * aCoeff() - 2) / 10 + 1 + bCoeff() + bCoeff() / 4 + cCoeff() / 4 - 2 * cCoeff() % 7);
    }

    private int aCoeff() {
        return month <= 2 ? month + 10 : month - 2;
    }

    private int bCoeff() {
        return year <= 2 ? (year - 1) % 100 : year % 100;
    }

    private int cCoeff() {
        return year <= 2 ? (year - 1) / 100 : year / 100;
    }

    private String getNameOfDay(int number) {
        String day = null; // Local Variable
        switch (number) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;

            default:
                day = "Unknown";
                break;
        }
        return day;
    }

}
