package com.softuni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int countToPush = input[0];
        int countToPop = input[1];
        int elementToSearch = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            queue.offer(numbers[i]);
        }

        for (int i = 0; i < countToPop; i++) {
            queue.poll();
        }

        if (queue.contains(elementToSearch)) {
            System.out.println("true");
        } else if (queue.isEmpty()) {
            System.out.println("0");
        } else {
//            System.out.println(Collections.min(stack));
//            stack.stream()
//                    .min(Integer::compare)
//                    .get();
//            System.out.println(stack.stream().mapToInt(e -> e).min().getAsInt());
            int minElement = Integer.MAX_VALUE;
            for (Integer number : queue) {
                if (number < minElement) {
                    minElement = number;
                }
            }
            System.out.println(minElement);
        }


    }
}
