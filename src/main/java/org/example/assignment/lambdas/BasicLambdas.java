package org.example.assignment.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicLambdas {
    public static void main(String[] args) {

        System.out.println("=============== PART ONE ===============");
        consumer("Printable Lambda");
        supplier();
        predicate(-1);
        predicate(1);

        Predicate<Integer> checkEven = integer -> integer % 2 == 0;
        check(4, checkEven);
        check(7, checkEven);

        Predicate<String> checkMr = string -> string.startsWith("Mr");
        check("Mr. Joe Bloggs", checkMr);
        check("Ms. Ann Bloggs", checkMr);

        Person mike = new Person("Mike", 33, 1.8);
        Predicate<Person> check18OrOver = person -> person.getAge() >= 18;
        check(mike, check18OrOver);
        Person ann = new Person("Mike", 13, 1.5);
        check(ann, check18OrOver);

        function(25);
        System.out.println("=====================================");

        System.out.println("=============== PART TWO ===============");

        List<Person> people = getPeople();

        sortAge(people);
        Consumer<Person> personAge = person -> System.out.println("Person Age Print consumer :: " + person);
        people.forEach(personAge);
        people.forEach(System.out::println);

        sortName(people);
        Consumer<Person> personName = person -> System.out.println("Person Name Print consumer :: " + person);
        people.forEach(personName);
        people.forEach(System.out::println);

        sortHeight(people);
        Consumer<Person> personHeight = person -> System.out.println("Person Height Print consumer :: " + person);
        people.forEach(personHeight);
        people.forEach(System.out::println);

        System.out.println("=====================================");
    }

    private static void sortHeight(List<Person> people) {
        people.sort(Comparator.comparing(Person::getHeight));
    }

    private static void sortName(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }

    private static void sortAge(List<Person> people) {
        people.sort(Comparator.comparing(Person::getAge));
    }

    static void consumer(String toPrint) {
        Printable<String> printable = System.out::println;
        printable.print(toPrint);
        Consumer<String> consumer = s -> System.out.println(toPrint);
        consumer.accept(toPrint);
        Consumer<String> consumerMr = System.out::println;
        consumerMr.accept(toPrint);
    }

    static void supplier() {
        Retrievable<Integer> retrievable = () -> 77;
        System.out.println("with Retrievable :: " + retrievable.retrieve());
        Supplier<Integer> supplier = () -> 77;
        System.out.println("with Supplier :: " + supplier.get());
    }

    static void predicate(Integer theInteger) {
        Evaluate<Integer> evaluate = integer -> integer < 0;
        System.out.println("with Evaluate :: " + evaluate.isNegative(theInteger));
        Predicate<Integer> predicate = integer -> integer < 0;
        System.out.println("with Predicate :: " + predicate.test(theInteger));
    }

    static <T> void check(T object, Predicate<T> predicate) {
        System.out.println("check :: " + predicate.test(object));
    }

    static void function(Integer integer) {
        Functionable<Integer, String> functionable = i -> "The number is :: " + i;
        System.out.println("with Functionable :: " + functionable.applyThis(integer));
        Function<Integer, String> function = i -> "The number is :: " + i;
        System.out.println("with Function :: " + function.apply(integer));
    }

    private static List<Person> getPeople() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));
        return result;
    }
}