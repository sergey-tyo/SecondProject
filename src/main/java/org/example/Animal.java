package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private String birthDate;
    private List<String> commands;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public List<String> performCommands() {
        return commands;
    }

    public void learnCommand(String command) {
        if (!commands.contains(command)) {
            commands.add(command);
            System.out.println(name + " has learned a new command: " + command);
        } else {
            System.out.println(name + " already knows the command: " + command);
        }
    }

    public abstract void makeSound();
}