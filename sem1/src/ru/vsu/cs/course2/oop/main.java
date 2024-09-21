package ru.vsu.cs.course2.oop;

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

        Student student = new Student(LanguageLevel.B1, 20, "Ivan", "Ivanov", Gender.MALE, new Group(6, "General"));
        Student spanishStudent = new spanishStudent(LanguageLevel.C1, 24, "Anna", "Smirnova", Gender.FEMALE, new Group(3, "Spanish"));
        Student chineseStudent = new chineseStudent(LanguageLevel.A1, 21, "Makar", "Samokhin", Gender.MALE, new Group(2, "Chinese"));

        student.language();
        spanishStudent.language();
        chineseStudent.language();
    }
}
