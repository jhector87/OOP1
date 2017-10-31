package LoopsE2;

import java.util.Scanner;

public class PrimePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        int limit = in.nextInt();

        PrimeGenerator pg = new PrimeGenerator();

        int prime = pg.nextPrime();

        while (prime <= limit) {
            System.out.println(prime);
            pg.nextPrime();
        }
    }
}
