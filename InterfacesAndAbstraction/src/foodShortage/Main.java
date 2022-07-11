package foodShortage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String input = scanner.nextLine();
            String[] buyerParts = input.split(" ");
            Buyer buyer;
            String name = buyerParts[0];
            if (buyerParts.length == 3) {
                buyer = new Rebel(name);
            } else {
                buyer = new Citizen(name);
            }
            buyers.put(name, buyer);
        }

        String buyerName = scanner.nextLine();
        while(!"End".equals(buyerName)){
            Buyer buyer = buyers.get(buyerName);

            if(buyer != null){
                buyer.buyFood();
            }

            buyerName = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);
    }


}
