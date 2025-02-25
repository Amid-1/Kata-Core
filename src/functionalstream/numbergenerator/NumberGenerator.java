package functionalstream.numbergenerator;

@FunctionalInterface
public interface NumberGenerator<T extends Number> {
    boolean cond(T arg);
}

