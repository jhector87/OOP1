import java.util.Arrays;

public class Main {

    // e1
    public static void main(String[] args) {
        // a.
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1) * (i+1);
        }
        System.out.println("a: " + Arrays.toString(array));

        // b.
        int[] array2 = new int[20];
        System.out.println("b: " + Arrays.toString(array2));

        // c.
        int[] array3 = new int[20];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i % (array3.length/2);
        }
        System.out.println("c: " + Arrays.toString(array3));

    }
}
