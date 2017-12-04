/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: SquareSequence
 */

package ex4c;

public class SquareSequence implements Sequence {

    private int n = 0;

    public int next() {
        n++;
        return n * n;
    }
}
