package genericscollection.genericpair;

import java.util.Objects;


public class Pair<T, U> {
    private final T first;
    private final U second;


    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }


    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "Hello");

        Integer i = pair.getFirst();
        String s = pair.getSecond();

        Pair<String, Integer> pair2 = Pair.of("Hello", 1);

        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }
}


