package com.softuni;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class ReverseElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }

        for (Integer element : stack) {
            System.out.printf("%s ", stack.pop());
        }
    }
}
