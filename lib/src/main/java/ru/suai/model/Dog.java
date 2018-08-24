package ru.suai.model;

public class Dog implements Animal {
    private String name;

    public String say() {
        return "Woof";
    }

    public String getName() {
        return name;
    }
}
