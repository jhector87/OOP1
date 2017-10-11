package FunDataTypesCE;

import java.util.Scanner;

public class ElapseTimePrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first time: ");
        int t1 = sc.nextInt();

        System.out.print("Enter second time: ");
        int t2 = sc.nextInt();

        TimeInterval myInterval = new TimeInterval(t1, t2);
        System.out.println(myInterval.getTimeDifference());

    }
}
