package functionalstream.findMinMax;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxFinder {
    public static  <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer
    ) {
        List<? extends T> sortedList = stream
                .sorted(order)
                .collect(Collectors.toList());

        if (sortedList.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(sortedList.get(0), sortedList.get(sortedList.size() - 1));
        }
    }

}

// public <T> void findMinMax(
//        Stream<? extends T> stream,
//        Comparator<? super T> order,
//        BiConsumer<? super T, ? super T> minMaxConsumer
//) {
//    List<? extends T> sortedList = stream
//            .sorted(order)
//            .collect(Collectors.toList());
//
//    if (sortedList.isEmpty()) {
//        minMaxConsumer.accept(null, null);
//    } else {
//        minMaxConsumer.accept(sortedList.get(0), sortedList.get(sortedList.size() - 1));
//    }
//}


// public static <T> void findMinMax(
//
//            Stream<? extends T> stream,
//
//            Comparator<? super T> order,
//
//            BiConsumer<? super T, ? super T> minMaxConsumer) {
//        {
//            List<? extends T> sortedList = stream.sorted(order).collect(Collectors.toList());
//
//            if (sortedList.isEmpty()) {
//                minMaxConsumer.accept(null, null);
//            } else {
//                minMaxConsumer.accept(sortedList.get(0), sortedList.get(sortedList.size() - 1));
//            }
//        }
//    }