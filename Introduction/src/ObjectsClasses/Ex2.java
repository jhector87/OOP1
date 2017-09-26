package ObjectsClasses;

import java.awt.*;

public class Ex2 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10,10);
        Rectangle rect2 = new Rectangle(30,30,10,10);
        Rectangle rect3 = new Rectangle(rect1.intersection(rect2));

        System.out.println(rect3.toString());


    }
}
