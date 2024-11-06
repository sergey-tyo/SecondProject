package org.example;

import java.util.List;

public class Donkey extends PackAnimals{
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Hee-haw!");
    }

    @Override
    public List<String> performCommands() {
        return List.of("Walk", "Sit");
    }
}