package org.example.assignment.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdasAndMethodReferences {

    public static void main(String[] args) {
        staticMr();
    }

    static void staticMr() {
        List<Integer> integers = Arrays.asList(1, 2, 7, 5);
        Consumer<List<Integer>> sortConsumer = integerList -> Collections.sort(integerList);
        sortConsumer.accept(integers);
        assert integers.get(0) == 1;
        assert integers.get(1) == 2;
        assert integers.get(2) == 5;
        assert integers.get(3) == 7;

        integers = Arrays.asList(1, 2, 7, 5);
        // the consumer only takes one argument, in this case List<Integer>, so will invoke Collections.sort(List<Integer> integerList)
        Consumer<List<Integer>> sortConsumerMr = Collections::sort;
        sortConsumerMr.accept(integers);
        assert integers.get(0) == 1;
        assert integers.get(1) == 2;
        assert integers.get(2) == 5;
        assert integers.get(3) == 7;

    }
}