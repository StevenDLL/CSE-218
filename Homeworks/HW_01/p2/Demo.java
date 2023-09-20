package Homeworks.HW_01.p2;

public class Demo {
    public static void main(String[] args) {
        StudentBag studentBag1 = new StudentBag();
        studentBag1.fill(1000);

        StudentBag studentBag2 = new StudentBag();
        studentBag2.fill(1000);

        StudentBag studentBag3 = new StudentBag();
        studentBag3.fill(1000);

        StudentBag studentBag4 = new StudentBag();
        studentBag4.fill(999);

        long start;
        long end;

        start = System.nanoTime();
        studentBag1.bubbleSort();
        end = System.nanoTime();
        System.out.println("Algorithm Time: " + (end - start));

        start = System.nanoTime();
        studentBag2.selectionSort();
        end = System.nanoTime();
        System.out.println("Algorithm Time: " + (end - start));

//        start = System.nanoTime();
//        studentBag3.insertionSort();
//        end = System.nanoTime();
//        System.out.println("Algorithm Time: " + (end - start));

        Student me = new Student();
        me.name = "Steven";
        studentBag4.insert(me);

        start = System.nanoTime();
        studentBag4.sequentialSearchByName("Steven");
        end = System.nanoTime();
        System.out.println("Algorithm Time: " + (end - start));

        start = System.nanoTime();
        studentBag4.binarySearchByName("Steven");
        end = System.nanoTime();
        System.out.println("Algorithm Time: " + (end - start));


    }

}
