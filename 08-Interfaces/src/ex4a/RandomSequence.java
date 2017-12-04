/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: RandomSequence
 */

package ex4a;

public class RandomSequence implements Sequence {

    public int next() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
