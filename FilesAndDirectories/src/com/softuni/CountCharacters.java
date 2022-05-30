package com.softuni;

import java.io.*;

public class CountCharacters {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try (FileReader fileReader = new FileReader("src/resources/input.txt");
             PrintWriter printWriter = new PrintWriter("src/resources/output.txt")) {
            int oneSymbol = fileReader.read();
            while(oneSymbol >= 0){
                char symbolAsChar = (char) oneSymbol;
                if(isVowel(symbolAsChar)){
                    vowels++;
                } else if(isPunctuation(symbolAsChar)){
                    punctuation++;
                } else if(!Character.isWhitespace(symbolAsChar) && !Character.isDigit(symbolAsChar)){
                    consonants++;
                }
                oneSymbol = fileReader.read();
            }
            printWriter.println("Vowels: " + vowels);
            printWriter.println("Consonants: " + consonants);
            printWriter.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean isVowel(char character){
        return character == 'a' || character == 'o'|| character == 'u'|| character == 'e'|| character == 'i';
    }

    public static boolean isPunctuation(char character){
        return character == '!' || character == ','|| character == '.'|| character == '?';
    }


}
