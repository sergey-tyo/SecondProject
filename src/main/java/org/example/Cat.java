package org.example;

import java.util.List;

public class Cat extends Pets{
    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public List<String> performCommands() {
        return List.of("Meow", "Fetch");
    }
}