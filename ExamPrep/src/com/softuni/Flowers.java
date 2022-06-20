package com.softuni;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] liliesInput = scanner.nextLine().split(", ");
        String[] rosesInput = scanner.nextLine().split(", ");

        List<Integer> lilies = Arrays.stream(liliesInput).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> roses = Arrays.stream(rosesInput).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> liliesStack = new ArrayDeque<>();
        for (Integer lily : lilies) {
            liliesStack.push(lily);
        }
        ArrayDeque<Integer> rosesQueue = new ArrayDeque<>();
        for (Integer rose : roses) {
            rosesQueue.offer(rose);
        }

        int wreaths = 0;
        int otherFlowers = 0;

        while (!liliesStack.isEmpty() && !rosesQueue.isEmpty()) {
            int lily = liliesStack.pop();
            int rose = rosesQueue.poll();

            int sum = lily + rose;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }

            if (sum == 15) {
                wreaths++;
            } else if (sum < 15) {
                otherFlowers += sum;
            }
        }

        int leftoverWreaths = otherFlowers / 15;
        wreaths += leftoverWreaths;

        if(wreaths >= 5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }

    }
}

