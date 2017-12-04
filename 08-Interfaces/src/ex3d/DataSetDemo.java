/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: DataSetDemo
 */

package ex3d;

import java.util.ArrayList;
import java.util.Comparator;

public class DataSetDemo {
    public static void main(String[] args) {
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount(15000, 2.3));
        list.add(new BankAccount(10000, 2.5));
        list.add(new BankAccount(20000, 1.5));

        list.sort(new Comparator<BankAccount>() {
            public int compare(BankAccount first, BankAccount second) {
                return Double.compare(first.getBalance(), second.getBalance());
            }
        });
        System.out.println("Max. balance: " +list.get(list.size() - 1).getBalance());

        list.sort(new Comparator<BankAccount>() {
            public int compare(BankAccount first, BankAccount second) {
                return Double.compare(first.getBalance(), second.getBalance());
            }
        });

        System.out.println("Max. interest balance: " +list.get(list.size() - 1).getInterestRate());




    }
}
