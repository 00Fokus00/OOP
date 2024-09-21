package ru.vsu.cs.course2.oop;

public class Education {
    private final String name;
    private final String direction;

    public Education(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return name;
    }
}