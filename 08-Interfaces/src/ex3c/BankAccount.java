/**
 * @author jonathanhector on ${TODAY.YEAR}
 * Copyrighted (c) Hector Graphics. All rights reserved.
 * Project: BankAccount
 */

package ex3c;

public class BankAccount {

    private double balance;
    private double interestRate;

    public BankAccount(double initBal, double rate) {
        this.balance = initBal;
        this.interestRate = rate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
