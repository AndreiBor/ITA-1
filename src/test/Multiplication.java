package test;

import java.math.BigInteger;

public class Multiplication {

    public static void main(String[] args) {
        int a = 0;
        int b = 25;
        long result = 1;
        do {
            result = result * ++a;
            a++;
        } while ((a + 1) <= b);
        System.out.println(result);
    }
}