package ru.vsu.cs.course2.oop;

public abstract class Human {
    private final int age;
    private final String name;
    private final String surname;
    private final main.Gender gender;


    public Human(int age, String name, String surname, main.Gender gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    public String toString(){
        return name + " " + surname + " " + age + " " + gender;
    }
}