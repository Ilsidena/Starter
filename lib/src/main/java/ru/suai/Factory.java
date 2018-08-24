package ru.suai;

import ru.suai.model.Animal;

public class Factory {
    protected Animal animal;

    public Factory (Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return String.format("%s says %s", animal.getName(), animal.say());
    }
}