package ru.suai.model;

public class Cat implements Animal {
    private String name;

    public String say() {
        return "Meow";
    }

    public String getName() {
        return name;
    }
}
