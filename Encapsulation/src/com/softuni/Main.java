package com.softuni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Pesho";
        String name2 = scanner.nextLine();


        if(name == name2){
            System.out.println("They are equal!!!");
        } else {
            System.out.println("They are not equal!!!");
        }
    }
}
