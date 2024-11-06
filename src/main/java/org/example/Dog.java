package org.example;

import java.util.List;

public class Dog extends Pets{
    public Dog(String name, String birthDate) {
        super(name, birthDate);
        learnCommand("Sit");
        learnCommand("Stay");
        learnCommand("Fetch");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}