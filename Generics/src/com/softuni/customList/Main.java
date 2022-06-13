package com.softuni.customList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();

        while(!input.equals("END")){
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName){
                case "Add":
                    String elementToAdd = commandParts[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String elementToSearch = commandParts[1];
                    System.out.println(customList.contains(elementToSearch));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commandParts[1]);
                    int secondIndex = Integer.parseInt(commandParts[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String element = commandParts[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
