package com.softuni;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> smallestInt = (int[] arr) -> {
            int min = Integer.MAX_VALUE;
            for (int element : arr) {
                if(element < min){
                    min = element;
                }
            }
            return min;
        };

//        Function<int[], Integer> function = arr -> Arrays.stream(arr).min().getAsInt();
//        Function<int[], Integer> func = arr -> Collections.min(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        System.out.println(smallestInt.apply(numbers));

    }

    public static Integer smallestInt(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if(element < min){
                min = element;
            }
        }
        return min;
    }
}
