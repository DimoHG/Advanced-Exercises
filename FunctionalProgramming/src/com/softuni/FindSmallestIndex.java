package com.softuni;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        Function<List<Integer>, Integer> minElementIndex = integerList -> {
//            int minElement = Integer.MAX_VALUE;
//            int minIndex = -1;
//            for (int i = 0; i < integerList.size(); i++) {
//                if(integerList.get(i) <= minElement){
//                    minElement = integerList.get(i);
//                    minIndex = i;
//                }
//            }
//            return minIndex;
//        };
        Function<List<Integer>, Integer> minElementIndex = integerList -> {
            int minElement = integerList.stream().mapToInt(e -> e).min().getAsInt();
            return integerList.lastIndexOf(minElement);
        };

        System.out.println(minElementIndex.apply(list));
    }

    public static Integer minElementIndex(List<Integer> list) {
        int minElement = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) <= minElement){
                minElement = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
