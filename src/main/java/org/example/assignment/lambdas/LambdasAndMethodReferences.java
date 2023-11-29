package org.example.assignment.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasAndMethodReferences {

    public static void main(String[] args) {
        staticMr();
        boundMr();
    }

    static void staticMr() {
        System.out.println("Static Method Reference");
        List<Integer> integers = Arrays.asList(1, 2, 7, 5);
        integers.forEach(integer -> System.out.println("unsorted :: " + integer));
        Consumer<List<Integer>> sortConsumer = integerList -> Collections.sort(integerList);
        sortConsumer.accept(integers);
        assert integers.get(0) == 1;
        assert integers.get(1) == 2;
        assert integers.get(2) == 5;
        assert integers.get(3) == 7;
        integers.forEach(integer -> System.out.println("sorted :: " + integer));

        integers = Arrays.asList(1, 2, 7, 5);
        integers.forEach(integer -> System.out.println("unsorted :: " + integer));
        // the consumer only takes one argument, in this case List<Integer>, so will invoke Collections.sort(List<Integer> integerList)
        Consumer<List<Integer>> sortConsumerMr = Collections::sort;
        sortConsumerMr.accept(integers);
        assert integers.get(0) == 1;
        assert integers.get(1) == 2;
        assert integers.get(2) == 5;
        assert integers.get(3) == 7;
        integers.forEach(integer -> System.out.println("sorted :: " + integer));
    }

    static void boundMr(){
        System.out.println("Bound Method Reference");
        String name = "Mr Joe Blogs";
        Predicate<String> startsWith = (prefix) -> name.startsWith(prefix);
        System.out.println(startsWith.test("Mr"));
        System.out.println(startsWith.test("Ms"));
        Predicate<String> startsWithMr = name::startsWith;
        System.out.println(startsWithMr.test("Mr"));
        System.out.println(startsWithMr.test("Ms"));
    }
}