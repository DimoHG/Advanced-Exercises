package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        while (!animalType.equals("Beast!")) {
            String[] animalInfo = scanner.nextLine().split(" ");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];
            try {
                System.out.println(animalType);
                switch (animalType) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        System.out.println(cat.produceSound());
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        System.out.println(frog.produceSound());
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        System.out.println(dog.produceSound());
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        System.out.println(kitten.produceSound());
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        System.out.println(tomcat.produceSound());
                        break;
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            animalType = scanner.nextLine();
        }
    }
}
