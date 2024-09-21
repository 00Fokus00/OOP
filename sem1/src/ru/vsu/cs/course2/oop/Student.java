package ru.vsu.cs.course2.oop;



public class Student extends Human{
    private final main.LanguageLevel languageLevel;
    private final Group group;
    public Student(String name, String surname, int age, main.LanguageLevel level, main.Gender gender, Group group) {
        super(age, name, surname, gender);
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
}