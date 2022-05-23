package com.softuni;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
       //1
       //2
       //3
       //4
    }

    public static void a(int number){
        if(number == 0){
            return;
        }
        System.out.println(number);
        number--;
        a(number);
    }

    public static void b(){
        System.out.println("B");
    }

}
