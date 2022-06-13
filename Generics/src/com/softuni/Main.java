package com.softuni;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = a; // 5
        a = b; // a -> 10
        b = temp; // b -> 5
        System.out.println(a);
        System.out.println(b);
        //a = 10, b = 5;
    }

    public static <T extends Comparable<T>> T min(List<T> list){
        T min = list.get(0);
        for (T element : list) {
            if(min.compareTo(element) > 0){
                min = element;
            }
        }
        return min;
    }

}
