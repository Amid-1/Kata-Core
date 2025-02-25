package functionalstream.biginteger;

import java.math.BigInteger;

import static functionalstream.biginteger.FactorialCalculator.factorial;

public class Test {
    public static void main(String[] args) {
        testFactorial(0, BigInteger.ONE);  // Граничный случай
        testFactorial(1, BigInteger.ONE);  // Минимальное значение
        testFactorial(3, BigInteger.valueOf(6));
        testFactorial(5, BigInteger.valueOf(120));
        testFactorial(10, BigInteger.valueOf(3628800));  // Большее число
    }

    private static void testFactorial(int value, BigInteger expected) {
        BigInteger result = factorial(value);
        System.out.println("Factorial of " + value + ": " + result);
        System.out.println("Test " + (result.equals(expected) ? "PASSED" : "FAILED"));
    }
}
