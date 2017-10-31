package FunDataTypesCE;

import java.math.BigDecimal;

public class BigInteger {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("4.35");
        BigDecimal b = new BigDecimal("3.45");

        b.setScale(5); System.out.println(b);
    }

}
