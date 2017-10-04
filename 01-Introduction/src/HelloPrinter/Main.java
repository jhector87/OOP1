package HelloPrinter;

import java.awt.Rectangle;

public class Main {

    public static void main(String[] args) {
        String greeting = "Hello World";
        System.out.println("Hello!");

        String river = "Rhein";
        String bigRiver = river.toUpperCase();
        System.out.println(river.length());
        System.out.println(bigRiver);
        String newRiver = river.replace("ein", "ône");
        System.out.println(newRiver);

        String sub1 = greeting.substring(2, 8);
        String sub2 = greeting.substring(3);

        System.out.println(sub1 + "\n" + sub2);

        Rectangle box = new Rectangle(5, 10, 20, 48);
        double w = box.getWidth();
        System.out.println(w);

        box.translate(15, 25);
        System.out.println(box.toString());
    }
}
