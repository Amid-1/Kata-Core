package genericscollection.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> s = new HashSet<>(set1);
        Set<T> t = new HashSet<>(set2);

        s.removeAll(set2); // Удаляем из result все элементы set2 -> остаются уникальные из set1
        t.removeAll(set1);   // Удаляем из temp все элементы set1 -> остаются уникальные из set2

        s.addAll(t);    // Объединяем обе разности
        return s;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        Set<Integer> symmetricDifference = symmetricDifference(set1, set2);
        System.out.println(symmetricDifference);
    }
}
