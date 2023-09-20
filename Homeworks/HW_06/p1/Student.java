package Homeworks.HW_06.p1;

public class Student {

    private String firstName;
    private String lastName;
    private Double gpa;

    public Student(String firstName, String lastName, Double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getGpa() {
        return gpa;
    }

    private void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getStudentInfo() {
        //return String.format("%-15s%35s", this.firstName + " " + this.lastName, this.gpa);
        return this.firstName + " " + this.lastName + " " + this.gpa;
    }

}
