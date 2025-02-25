package functionalstream.numbergenerator;

public class Main {
    public static void main(String[] args) {
        // Получаем генератор
        NumberGenerator<? super Number> numGen = NumberUtils.getGenerator();

        // Проверяем различные числа
        System.out.println(numGen.cond(123456L));  // true
        System.out.println(numGen.cond(123456.56)); // true
        System.out.println(numGen.cond(132));      // true
        System.out.println(numGen.cond(Byte.MAX_VALUE));  // true
        System.out.println(numGen.cond(-5.5));    // false
        System.out.println(numGen.cond(-1253523525L)); // false
        System.out.println(numGen.cond(0));       // false
        System.out.println(numGen.cond(-2));      // false
        System.out.println(numGen.cond(Byte.MIN_VALUE)); // false
    }
}
