package com.frank;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mkyong", "java", "kotlin", "spring boot", "android");

        var iterator = list.iterator();

        List<Integer> result = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false)
                .map(x -> x.length())
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
