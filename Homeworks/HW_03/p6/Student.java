package Homeworks.HW_03.p6;

import Homeworks.HW_03.AcceptableItems;

import java.util.Random;

public class Student implements AcceptableItems {
    String name;
    String id;
    Double gpa;

    public Student(String name, Double gpa) {
        this.name = name;
        this.id = generateID();
        this.gpa = gpa;
    }

    private String generateID() {
        Random random = new Random();
        return String.valueOf(random.nextInt(1000000));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
