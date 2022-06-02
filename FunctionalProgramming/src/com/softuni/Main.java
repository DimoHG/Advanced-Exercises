package com.softuni;

import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

    }

    public static void test(Predicate<String> predicate){
        List<String> numbers = new ArrayList<>();
        numbers.stream().filter(predicate);
    }

    public static Predicate<String> test2(){
        return s -> s.length() < 3;
    }

    //accepts argument?
    //return?

//        Function<приема, връща>
//        UnaryOperator<приема/връща>
//        Predicate<приема> връща boolean
    //    Supplier<връща>
    //    Consumer<приема> не връща нищо
}
