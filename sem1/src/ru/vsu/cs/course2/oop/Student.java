package ru.vsu.cs.course2.oop;



public class Student implements Interfaces.Speaking {
    private final String name;
    private final String surname;
    private final int age;
    private final main.LanguageLevel languageLevel;
    private final main.Gender gender;
    private final Group group;
    public Student(String name, String surname, int age, main.LanguageLevel level, main.Gender gender, Group group) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.languageLevel = level;
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString() + " " + languageLevel;
    }
    public void language(){
        System.out.println("Я учу иностранный язык");
    }

    @Override
    public void speak() {
        System.out.println("Я люблю изучать языки!");
    }
}