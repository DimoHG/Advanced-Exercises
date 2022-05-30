package com.softuni;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) {
        //четем със скенер и пишем с PrintWriter(with append!)
        //четем със скенер и пишем с PrintWriter(with append!)
        Path input1 = Paths.get("src/resources/inputOne.txt");
        Path input2 = Paths.get("src/resources/inputTwo.txt");
        Path output = Paths.get("src/resources/output.txt");
        try {
            List<String> firstFile = Files.readAllLines(input1);
            List<String> secondFile = Files.readAllLines(input2);
            Files.write(output, firstFile, StandardOpenOption.APPEND);
            Files.write(output, secondFile, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
