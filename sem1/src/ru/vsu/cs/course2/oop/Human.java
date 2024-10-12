package ru.vsu.cs.course2.oop;

public class Human implements Interfaces.Speaking {
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

    @Override
    public void speak() {
        System.out.println("Я не учу иностранные языки:(");
    }
}