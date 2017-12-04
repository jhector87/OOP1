/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: DataSetDemo
 */

package ex3b;

import java.util.ArrayList;

public class DataSetDemo {
    public static void main(String[] args) {
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount(15000, 2.3));
        list.add(new BankAccount(10000, 2.5));
        list.add(new BankAccount(20000, 1.5));

        DataSet data = new DataSet(new Measurer() {
            public double measure(Object obj) {
                return ((BankAccount)obj).getBalance();
            }
        });
        for (BankAccount acc : list)
            data.add(acc);

        BankAccount max = (BankAccount) data.getMax();
        System.out.println("Max. balance: " + max.getBalance());

        data = new DataSet(new Measurer() {
            public double measure(Object obj) {
                return ((BankAccount)obj).getInterestRate();
            }
        });
        for (BankAccount acc : list)
            data.add(acc);

        max = (BankAccount) data.getMax();
        System.out.println("Max. interest rate: " + max.getInterestRate());

    }
}
