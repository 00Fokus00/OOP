package ru.vsu.cs.course2.oop;

public class chineseStudent extends Student{

    public chineseStudent(String name, String surname, int age, main.LanguageLevel level, main.Gender gender, Group group) {
        super(name, surname, age, level, gender, group);
    }

    @Override
    public void language() {
        System.out.println("Я учу китайский язык");
    }
}
