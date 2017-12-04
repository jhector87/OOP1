/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: BalanceMeasurer
 */

package ex3a;

public class BalanceMeasurer implements Measurer {

    public double measure(Object obj) {
        return ((BankAccount)obj).getBalance();
    }
}
