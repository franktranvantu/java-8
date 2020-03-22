package com.frank.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IterableToStreamExample {

    public static void main(String[] args) {
        Iterable<String> list = Arrays.asList("mkyong", "java", "kotlin", "spring boot", "android");

        List<Integer> result = StreamSupport.stream(list.spliterator(), false)
                .map(x -> x.length())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
