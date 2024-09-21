package ru.vsu.cs.course2.oop;

public class spanishStudent extends Student{

    public spanishStudent(main.LanguageLevel level, int age, String name, String surname, main.Gender gender, Group group) {
        super(level, age, name, surname, gender, group);
    }

    @Override
    public void language() {
        System.out.println("Я учу испанский язык");
    }
}