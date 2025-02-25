package functionalstream.numbergenerator;

public class NumberUtils {

    // Метод возвращает реализацию интерфейса NumberGenerator
    public static NumberGenerator<? super Number> getGenerator() {
        return number -> number.intValue() > 0;
    }
}
