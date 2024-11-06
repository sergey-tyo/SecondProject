package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Registry {
    private List<Animal> animals;

    public Registry() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(String type, String name, String birthDate) {
        Animal animal;

        switch (type.toLowerCase()) {
            case "dog":
                animal = new Dog(name, birthDate);
                break;
            case "cat":
                animal = new Cat(name, birthDate);
                break;
            case "hamster":
                animal = new Hamster(name, birthDate);
                break;
            case "horse":
                animal = new Horse(name, birthDate);
                break;
            case "camel":
                animal = new Camel(name, birthDate);
                break;
            case "donkey":
                animal = new Donkey(name, birthDate);
                break;
            default:
                System.out.println("Unknown animal type: " + type);
                return;
        }
        animals.add(animal);
        System.out.println(type + " " + name + " has been added to the registry.");
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName() + " - Name: " + animal.getName() + ", Birth Date: " + animal.getBirthDate());
        }
    }

    public void showAnimalCommands(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)){
                System.out.println("Commands for " + name + ": " + animal.performCommands());
                return;
            }
        }
        System.out.println("Animal with name " + name + " not found in the registry.");
    }

    public void teachCommand(String name, String command) {
        for (Animal animals : animals) {
            if (animals.getName().equalsIgnoreCase(name)) {
                animals.learnCommand(command);
                return;
            }
        }
        System.out.println("Animal with name " + name + " not found in the registry.");
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public Animal getAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void printAllAnimals() {
        System.out.println("All animals: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getBirthDate());
        }
    }

    public void printAnimalByBirthDate() {
        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getBirthDate().compareTo(o2.getBirthDate());
            }
        });

        System.out.println("List of all Animals by BirthDate: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - " + animal.getBirthDate());
        }
    }
}