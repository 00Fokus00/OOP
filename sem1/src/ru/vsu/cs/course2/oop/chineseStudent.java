package ru.vsu.cs.course2.oop;

public class chineseStudent extends Student{

    public chineseStudent(main.LanguageLevel level, int age, String name, String surname, main.Gender gender, Group group) {
        super(level, age, name, surname, gender, group);
    }

    @Override
    public void language() {
        System.out.println("Я учу китайский язык");
    }
}
