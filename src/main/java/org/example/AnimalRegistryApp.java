package org.example;

import java.util.Scanner;

public class AnimalRegistryApp {

    Registry registry = new Registry();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\n---Menu---");
            System.out.println("1. Add animal");
            System.out.println("2. Print all animals");
            System.out.println("3. Print all animals by birth date");
            System.out.println("4. Find animal by name");
            System.out.println("5. Remove animal");
            System.out.println("6. Exit");
            System.out.println("Choose the option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter animal name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter birth date (YYYY-MM-DD): ");
                    String birthdate = scanner.nextLine();
                    System.out.println("Enter type of animal (dog/cat/hamster/horse/camel/donkey): ");
                    String type = scanner.nextLine();

                    Animal animal = null;
                    switch (type) {
                        case "dog":
                            registry.addAnimal("dog", name, birthdate);
                            break;
                        case "cat":
                            registry.addAnimal("cat", name, birthdate);
                            break;
                        case "hamster":
                            registry.addAnimal("hamster", name, birthdate);
                            break;
                        case "horse":
                            registry.addAnimal("horse", name, birthdate);
                            break;
                        case "camel":
                            registry.addAnimal("camel", name, birthdate);
                            break;
                        case "donkey":
                            registry.addAnimal("donkey", name, birthdate);
                        default:
                            System.out.println("Incorrect type of animal.");
                    }
                    System.out.println("Animal has been added.");
                    break;
                case 2:
                    registry.printAllAnimals();
                    break;
                case 3:
                    registry.printAnimalByBirthDate();
                    break;
                case 4:
                    System.out.println("Enter animal name for searching: ");
                    String searchName = scanner.nextLine();
                    Animal foundAnimal = registry.getAnimalByName(searchName);
                    if (foundAnimal != null) {
                        System.out.println("Found: " + foundAnimal.getName() + " - " + foundAnimal.getBirthDate());
                    } else {
                        System.out.println("Animal was not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter animal name for removing: ");
                    String removeName = scanner.nextLine();
                    Animal animalToRemove = registry.getAnimalByName(removeName);
                    if (animalToRemove != null) {
                        registry.removeAnimal(animalToRemove);
                        System.out.println("Animal has been removed.");
                    } else {
                        System.out.println("Animal was not found.");
                    }
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Incorrect choice. Please choose again.");
            }
        }
        scanner.close();
    }
}