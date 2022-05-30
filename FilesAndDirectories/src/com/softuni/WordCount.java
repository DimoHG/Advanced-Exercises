package com.softuni;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        //1. прочитаме думите, които ще търсим
        //2. прочитаме дума по дума втория файл
        //3. записваме резултата на няколко реда в трети файл
        try(Scanner scan = new Scanner(new FileReader("src/resources/words.txt"));
            Scanner textScanner = new Scanner(new FileReader("src/resources/text.txt"));
            PrintWriter printWriter = new PrintWriter("src/resources/results.txt")){

            LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach(word -> wordMap.put(word, 0));
            while(textScanner.hasNext()){
                String textInput = textScanner.next();
                if(wordMap.containsKey(textInput)){
                    int occurrences = wordMap.get(textInput);
                    occurrences++;
                    wordMap.put(textInput, occurrences);
                }
            }
            wordMap.entrySet().forEach(entry -> printWriter.printf("%s - %d%n", entry.getKey(), entry.getValue()));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
