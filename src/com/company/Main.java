package com.company;

import School.Student;
import School.Teaher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Lesson mathLesson = new Lesson("Математика", 20, "экзамен");
        Lesson differenEquatLesson = new Lesson("Диф. уравнения", 18, "зачет");
        Lesson biologyLesson = new Lesson("Биология", 15, "зачет");
        Lesson microBiologyLesson = new Lesson("Микробиология", 15, "экзамен");
        Lesson chemLesson = new Lesson("Химия", 15, "экзамен");

        Teaher[] teaher = new Teaher[2];
        Student[] student = new Student[3];

        teaher[0] = new Teaher();
        teaher[0].setName("Лебедева О.М.");
        teaher[1] = new Teaher();
        teaher[1].setName("Кудряшова Е.В.");

        teaher[0].addLesson(mathLesson);
        teaher[0].addLesson(differenEquatLesson);
        teaher[1].addLesson(biologyLesson);
        teaher[1].addLesson(microBiologyLesson);
        teaher[1].addLesson(chemLesson);

        student[0] = new Student();
        student[0].setName("Иванов И.К.");
        student[1] = new Student();
        student[1].setName("Васильев А.А.");
        student[2] = new Student();
        student[2].setName("Курашов А.А.");

        student[0].addLesson(mathLesson);
        student[0].addLesson(differenEquatLesson);
        student[0].addLesson(chemLesson);
        student[1].addLesson(mathLesson);
        student[1].addLesson(biologyLesson);
        student[1].addLesson(microBiologyLesson);
        student[2].addLesson(mathLesson);
        student[2].addLesson(differenEquatLesson);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SearthByName searth = new SearthByName();
        try {
            System.out.println("Введите имя учителя");
            searth.searth(teaher, br.readLine().trim()).teah();
        }
        catch (NullPointerException e) {
            System.out.println("Учитель не найден");
        }

        try {
            System.out.println("Введите имя студента");
            searth.searth(student, br.readLine().trim()).learn();
        }
        catch (NullPointerException e) {
            System.out.println("Студент не найден");
        }
    }
}
