package functionalstream.findMinMax;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMaxFinderTest  {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Comparator<Integer> comparator = Integer::compareTo;
        BiConsumer<Integer, Integer> biConsumer = (x1, x2) -> System.out.println("Min: " + x1 + ", Max: " + x2);

        MinMaxFinder.findMinMax(stream, comparator, biConsumer);
    }
}
