package org.example;

import java.util.Collections;
import java.util.List;

public class Hamster extends Pets{
    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }

    @Override
    public List<String> performCommands() {
        return Collections.singletonList("Run in wheel");
    }
}