package functionalstream.biginteger;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialCalculator {
    public static BigInteger factorial(int value) {
        return IntStream.rangeClosed(1, value)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public static void main(String[] args) {
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(5)); // 120
    }
}

