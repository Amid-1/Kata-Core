package functionalstream.loremipsum;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;

public class WordFrequency {
    public static void countOfWords(InputStream input, Charset charset) {
        new BufferedReader(new InputStreamReader(input, charset))
                .lines()
                .map(String::toLowerCase)
                .map(line -> line.replaceAll("[^\\p{L}\\d]+", " "))
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    scanner.tokens()
        .map(String::toLowerCase)
        .map(line -> line.replaceAll("[^\\p{L}\\d]+", " "))
        .flatMap(line -> Arrays.stream(line.split("\\s+")))
        .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
        .entrySet()
        .stream()
        .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue).reversed()
                .thenComparing(Map.Entry::getKey))
        .limit(10)
        .forEach(entry -> System.out.println(entry.getKey()));

    scanner.close();
}

 */
