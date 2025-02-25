package arithmetik;

import java.math.BigInteger;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }

}
