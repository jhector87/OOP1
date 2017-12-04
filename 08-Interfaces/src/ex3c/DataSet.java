/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: DataSet
 */

package ex3c;

public class DataSet {

    private Object max;
    private Measurer meas;

    public DataSet(Measurer m) {
        this.meas = m;
    }

    public void add(Object x) {
        if(max == null || meas.measure(x) > meas.measure(max)) max = x;
    }

    public Object getMax() {
        return max;
    }
}