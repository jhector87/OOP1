/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: DataSetDemo
 */

package ex3f;

import java.util.ArrayList;
import java.util.Comparator;

public class DataSetDemo {
    public static void main(String[] args) {
        ArrayList<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount(15000, 2.3));
        list.add(new BankAccount(10000, 2.5));
        list.add(new BankAccount(20000, 1.5));

        list.sort(Comparator.comparing(acc -> acc.getBalance()));
        System.out.println("Max. balance: " + list.get(list.size() - 1).getBalance());

        list.sort(Comparator.comparing(acc -> acc.getInterestRate()));
        System.out.println("Max. interest rate: " + list.get(list.size() - 1).getInterestRate());

        System.err.println("FULL Lambda");
        list.sort(Comparator.comparingDouble(BankAccount::getBalance));
        System.out.println("Max. balance: " + list.get(list.size() - 1).getBalance());

        list.sort(Comparator.comparingDouble(BankAccount::getInterestRate));
        System.out.println("Max. interest rate: " + list.get(list.size() - 1).getInterestRate());

    }
}