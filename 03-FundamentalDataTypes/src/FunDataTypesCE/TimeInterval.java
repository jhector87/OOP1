package FunDataTypesCE;

public class TimeInterval {

    private static final int MINUTES_PER_DAY = 24 * 60;
    private int time1, time2;

    public TimeInterval(int time1, int time2) {
        int hours = time1 / 100; int min = time1 % 100;
        this.time1 = hours * 60 + min;

        hours = time2 / 100; min = time2 % 100;
        this.time2 = hours * 60 + min;
    }

    public String getTimeDifference() {
        int timeDifference = (time2 - time1 + MINUTES_PER_DAY) % MINUTES_PER_DAY;
        return timeDifference / 60 + "h. and" + timeDifference % 60 + "min.";
    }
}
