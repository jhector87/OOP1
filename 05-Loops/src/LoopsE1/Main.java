package LoopsE1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DataSet ds = new DataSet();
        System.out.print("Enter value ('q' to quit): ");
        while (sc.hasNextDouble()) {
            double v = sc.nextDouble();
            ds.add(v);
        }
        System.out.printf("Average: %.3f\n", + ds.getAverage());
        System.out.println("Smallest: " + ds.getSmallest());

    }
}
