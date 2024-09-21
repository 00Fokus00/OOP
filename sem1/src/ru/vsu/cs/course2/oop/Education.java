package ru.vsu.cs.course2.oop;

public class Education {
    private final String level;

    public Education(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return level;
    }
}