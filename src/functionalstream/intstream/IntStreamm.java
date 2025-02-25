package functionalstream.intstream;

import java.util.stream.IntStream;

public class IntStreamm {
    public static void main(String[] args) {
        pseudoRandomStream(13)
                .limit(10)
                .forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return  IntStream.iterate(seed, n -> mid(n * n));
    }
    private static int mid(int n) {
        return (n / 10) % 1000;
    }

}

// public static IntStream pseudoRandomStream(int seed) {
//    return IntStream.iterate(seed, n -> (n * n / 10) % 1000);
//}
