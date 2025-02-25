package functionalstream.unaryoperator;

import java.util.function.UnaryOperator;

public class MathUtils {
    public UnaryOperator<Integer> sqrt() {
        return x -> x * x;  // Лямбда, которая возвращает квадрат числа
    }
}
