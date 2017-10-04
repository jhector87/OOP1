package ObjectsClasses;

import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {
        int x = 6;
        double maxPrice = 19.95;
        double minPrice = 10.00;

        /*
            ===========
               PART 1
            ===========
        */

        Random random = new Random();
        int dice = random.nextInt(x) + 1; // Must add 1 because random generates up to 5.
        System.out.println(dice);

        /*
            ===========
               PART 2
            ===========
        */
//        double price = random.nextDouble((maxPrice - minPrice) + minPrice);
        double price = Math.random() * (maxPrice - minPrice) + minPrice;
        System.out.printf("%.2f\n", price);
    }
}
