package com.softuni;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> people = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Party!")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];
            Predicate<String> predicate = getPredicate(commandParts);
            switch (command){
                case "Double":
                    List<String> peopleToAddAgain = new ArrayList<>();
                    people.stream().filter(predicate).forEach(person -> peopleToAddAgain.add(person));
                    people.addAll(peopleToAddAgain);
                    break;
                case "Remove":
                    people.removeIf(predicate);
                    break;
            }

            input = scanner.nextLine();
        }

        if(people.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(people);
            String result = String.join(", ", people) + " are going to the party!";
            System.out.println(result);
        }
    }

    public static Predicate<String> getPredicate(String[] commandParts){
        Predicate<String> predicate = null;
        String filterName = commandParts[1];
        String filterCriteria = commandParts[2];

        switch (filterName){
            case "StartsWith":
                predicate = name -> name.startsWith(filterCriteria);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(filterCriteria);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(filterCriteria);
                break;
        }
        return predicate;
    }
}
