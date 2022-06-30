package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        StarsField starsField = new StarsField(rows, cols);
        Galaxy galaxy = new Galaxy(starsField);

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {

            int[] jediPosition = readPositions(command);
            int[] evilPosition = readPositions(scanner.nextLine());

            int currentRowEvil = evilPosition[0];
            int currentColEvil = evilPosition[1];

            galaxy.moveEvil(currentRowEvil, currentColEvil);

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];

            long starsCollected = galaxy.moveJedi(currentRowJedi, currentColJedi);

            command = scanner.nextLine();
            System.out.println(starsCollected);
        }

    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
