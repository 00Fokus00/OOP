package ru.vsu.cs.course2.oop;

public class spanishStudent extends Student{

    public spanishStudent(String name, String surname, int age, main.LanguageLevel level, main.Gender gender, Group group) {
        super(name, surname, age, level, gender, group);
    }

    @Override
    public void language() {
        System.out.println("Я учу испанский язык");
    }
}