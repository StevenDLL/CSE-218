package Homeworks.HW_01.p2;

import java.util.Random;

public class StudentBag {
    Student[] arrayOfStudents;
    int nElements;

    StudentBag() {
        arrayOfStudents = new Student[1000];
        nElements = 0;

    }

    StudentBag(int size) {
        arrayOfStudents = new Student[size];
        nElements = 0;
    }

    public void insert(Student student) {
        if (student != null) {
            arrayOfStudents[nElements++] = student;
        }
    }

    public void fill(int numberOfStudents) {

        for (int i = 0; i < numberOfStudents; i++) {
            Student newStudent = new Student();
            newStudent.name = (getRandomName()) + "";
            newStudent.age = (int) (Math.random() * (41 - 18)) + 18;
            newStudent.gpa = (Math.random() * (4.0 - 0.0)); //Not sure if you wanted us to round but if so all needed is to use Math.round()
            //System.out.println(newStudent.name + "\t" + newStudent.age + "\t" + newStudent.gpa);
            insert(newStudent);
        }
    }

    private String getRandomName() {

        String string = (char) (new Random().nextInt(26) + 'A') + "";
        for (int i = 0; i < 4; i++) {
            string += (char) (new Random().nextInt(26) + 'a');
        }
        return string;
    }

    public void displayStudents() {
        for (int i = 0; i < nElements - 1; i++) {
            System.out.println("Name: " + arrayOfStudents[i].name + "\t" + "Age: " + arrayOfStudents[i].age + "\t" +
                    "GPA: " + arrayOfStudents[i].gpa);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < nElements; i++) {
            for (int j = 1; j < (nElements - i); j++) {
                if (arrayOfStudents[j - 1].name.compareTo(arrayOfStudents[j].name) > 0) {
                    Student temp = arrayOfStudents[j - 1];
                    arrayOfStudents[j - 1] = arrayOfStudents[j];
                    arrayOfStudents[j] = temp;

                }
            }
        }
    }

    public void selectionSort() {

        for (int i = 0; i < nElements - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nElements; j++) {
                if (arrayOfStudents[j].name.compareTo(arrayOfStudents[min].name) > 0) {
                    min = j;

                    Student temp = arrayOfStudents[min];
                    arrayOfStudents[min] = arrayOfStudents[i];
                    arrayOfStudents[i] = temp;
                }
            }
        }

    }

    public void insertionSort() {

    }

    public int sequentialSearchByName(String name) {
        for (int i = 0; i < nElements; i++) {
            if (arrayOfStudents[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchByName(String name) {
        int start = 0;
        int end = nElements - 1;
        while (end >= start) {
            int middle = (start + end) / 2;
            if (arrayOfStudents[middle].name.compareTo(name) == 0) {
                return middle;
            } else if (arrayOfStudents[middle].name.compareTo(name) > 0) {
                end = middle + 1;
            } else {
                start = middle - 1;
            }
        }
        return -1;
    }

}
