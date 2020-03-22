package com.frank.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mkyong");
        list.add("java");
        list.add("kotlin");
        list.add("spring boot");
        list.add("android");

        Iterator<String> iterator = list.iterator();

        List<Integer> result = StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false)
                    .map(x -> x.length())
                    .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
