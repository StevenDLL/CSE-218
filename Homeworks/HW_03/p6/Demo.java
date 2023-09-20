package Homeworks.HW_03.p6;

public class Demo {
    public static void main(String[] args) {
        GBag<Student> studentGBag = new GBag<>(10);
        Student s1 = new Student("s",3.6);
        studentGBag.insert(new Student("Steven",3.2));
        System.out.println();
    }
}
