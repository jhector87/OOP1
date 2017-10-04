package NumberLiterals;

public class Main {

    public static void main(String[] args) {
    // Number literals
        int i;
        i = 98;
        System.out.println(i);

        i = 015; // 0 means Octal
        System.out.println(i);

        i = 0x12cf; // 0x means Hexadecimal
        System.out.println(i);

        i = 0b1101; // 0b means Binary
        System.out.println(i);

        // Number types
        byte b = 123;
        // b = 256; //Wrong
        b = Byte.MAX_VALUE; // 127
        System.out.println(b);

        short s =512;
        s = Short.MIN_VALUE; // -32768
        System.out.println(s);

        long lg = 456L;

        double d = 1.23;
        d = 1.23e8; //m1.23 X 10ˆ8
        System.out.println(d);
        d = 1.23e-8; //m1.23 X 10ˆ-8
        System.out.println(d);
        d = Double.MAX_VALUE;

        float f = 1.23F; //f--> float literal

        // Arithmetic
        i = 100000;
        System.out.println(i * i); // Overflow
        i = 456;
        System.out.println(i * 100);

    }
}
