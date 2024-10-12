package ru.vsu.cs.course2.oop;

import java.util.ArrayList;
import java.util.List;

public class main {
    public enum Gender {
        MALE,
        FEMALE
    }

    public enum LanguageLevel {
        A1,
        A2,
        B1,
        B2,
        C2,
        C1
    }

    public static void main(String[] args){

        Student student = new Student("Ivan", "Ivanov", 20, LanguageLevel.B1, Gender.MALE, new Group(6, 1));
        Student spanishStudent = new spanishStudent("Anna", "Smirnova", 24, LanguageLevel.C1, Gender.FEMALE, new Group(3, 2));
        Student chineseStudent = new chineseStudent("Makar", "Samokhin", 21, LanguageLevel.A1, Gender.MALE, new Group(2, 1));

        Human human = new Human(16, "Petr", "Petrov", Gender.MALE);

        List<Interfaces.Speaking> list = new ArrayList<>();
        list.add(human);
        list.add(student);

        for (int i = 0; i < list.size(); i++){
            list.get(i).speak();
        }

        /*student.language();
        spanishStudent.language();
        chineseStudent.language();*/
    }
}
