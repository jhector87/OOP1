package ObjectsClasses;

import java.awt.Rectangle;

public class Ex1 {
    private static int height = 50;
    private static int width = 50;

    public static void main(String[] args) {

        Rectangle square = new Rectangle(100, 100, width, height);
        System.out.println(square.getWidth());

        square.grow(height * 2, width * 2);
        square.translate(100, 100);
        square.grow(height / 2, width / 2);
        square.translate(50, 50);

        System.out.println(square.getWidth() + "\n" + square.toString());

        int w = square.width;
        w += w;

        System.out.println(w);
    }
}
