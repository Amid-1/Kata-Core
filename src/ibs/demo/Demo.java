package ibs.demo;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        list.forEach(str -> System.out.println(str));
    }
}
