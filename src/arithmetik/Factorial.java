package arithmetik;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}

// public static BigInteger factorial(int value) {
//    final BigInteger ONE = BigInteger.ONE;
//    if (value <= 1) {
//        return ONE;
//    }
//    return BigInteger.valueOf(value).multiply(factorial(value - 1));
//}
