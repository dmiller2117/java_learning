package org.example.assignment.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class LambdasAndMethodReferences {

    public static void main(String[] args) {
        staticMr();
        boundMr();
        unboundMR();
        constructorMR();
    }

    private static void staticMr() {
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

    private static void boundMr() {
        System.out.println("Bound Method Reference");
        String name = "Mr Joe Blogs";
        Predicate<String> startsWith = (prefix) -> name.startsWith(prefix);
        System.out.println(startsWith.test("Mr"));
        System.out.println(startsWith.test("Ms"));
        Predicate<String> startsWithMr = name::startsWith;
        System.out.println(startsWithMr.test("Mr"));
        System.out.println(startsWithMr.test("Ms"));
    }

    private static void unboundMR() {
        System.out.println("Unbound Method Reference");
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("xyz"));
        Predicate<String> isEmptyMr = String::isEmpty;
        System.out.println(isEmptyMr.test(""));
        System.out.println(isEmptyMr.test("xyz"));

        BiPredicate<String, String> startsWithFirst = (aString, aPrefix) -> aString.startsWith(aPrefix);
        System.out.println(startsWithFirst.test("Mr Joe Bloggs", "Mr"));
        System.out.println(startsWithFirst.test("Mr Joe Bloggs", "Ms"));
        BiPredicate<String, String> startsWithFirstMr = String::startsWith;
        System.out.println(startsWithFirstMr.test("Mr Joe Bloggs", "Mr"));
        System.out.println(startsWithFirstMr.test("Mr Joe Bloggs", "Ms"));
    }


    private static void constructorMR() {
        System.out.println("Constructor Method Reference");
        Supplier<List<String>> createArrayList = () -> new ArrayList<>();
        List<String> stringList = createArrayList.get();
        stringList.add("Lambda");
        System.out.println(stringList);

        Supplier<List<String>> createArrayListMr = ArrayList::new;
        stringList = createArrayListMr.get();
        stringList.add("Lambda MR");
        System.out.println(stringList);

        Function<Integer, List<String>> createListWithSize = integer -> new ArrayList<>(integer);
        stringList = createListWithSize.apply(10);
        stringList.add("Lambda with list size");
        System.out.println(stringList);

        Function<Integer, List<String>> createListWithSizeMr = ArrayList::new;
        stringList = createListWithSizeMr.apply(10);
        stringList.add("Lambda with list size and method reference");
        System.out.println(stringList);
    }

}