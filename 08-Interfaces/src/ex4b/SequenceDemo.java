/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: SequenceDemo
 */

package ex4b;

import java.util.Arrays;

/**
 * @author jonathanhector on 2017
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: SequenceDemo on 04.12.17
 */

public class SequenceDemo {
    public static void main(String[] args) {
        LastDigitDistribution ldd0 = new LastDigitDistribution();
        ldd0.process(() -> 1, 1000);
        System.out.println(Arrays.toString(ldd0.getCounters()));

        LastDigitDistribution ldd1 = new LastDigitDistribution();
        ldd1.process(() -> (int) (Integer.MAX_VALUE * Math.random()), 1000);
        System.out.println(Arrays.toString(ldd1.getCounters()));

        LastDigitDistribution ldd2 = new LastDigitDistribution();
        ldd2.process(new Sequence() {
                private int n = 0;
                public int next() {
                    n++;
                    return n * n;
                }
        }, 1000);
        System.out.println(Arrays.toString(ldd2.getCounters()));
    }
}
