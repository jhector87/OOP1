/**
 * @author jonathanhector on 2017
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: LastDigitDistribution
 */

package ex4b;

public class LastDigitDistribution {

    private int[] counters = new int[10];

    public void process(Sequence seq, int numValues) {
        for (int i = 1; i <= numValues; i++) {
            int value = seq.next();
            int lastDigit = value % 10;
            counters[lastDigit]++;
        }
    }

    public int[] getCounters() {
        return counters;
    }
}
