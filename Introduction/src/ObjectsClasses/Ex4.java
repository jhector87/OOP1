package ObjectsClasses;

import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {
        int x = 6;
        double maxPrice = 19.95;
        double minPrice = 10.00;

        Random random = new Random();
        int dice = random.nextInt(x);
        System.out.println(dice);

//        double price = random.nextDouble((maxPrice - minPrice) + minPrice);
        double price =  Math.random() * (maxPrice - minPrice) + minPrice;
        System.out.println(price);
    }
}
