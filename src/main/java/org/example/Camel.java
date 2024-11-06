package org.example;

import java.util.List;

public class Camel extends PackAnimals{
    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Grunt!");
    }

    @Override
    public List<String> performCommands() {
        return List.of("Sit", "Stand");
    }
}