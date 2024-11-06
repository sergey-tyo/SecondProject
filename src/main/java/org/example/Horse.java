package org.example;

import java.util.List;

public class Horse extends PackAnimals{
    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh!");
    }

    @Override
    public List<String> performCommands() {
        return List.of("Walk", "Gallop");
    }
}