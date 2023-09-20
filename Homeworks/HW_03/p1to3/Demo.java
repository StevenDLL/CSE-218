package Homeworks.HW_03.p1to3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        pushAndPopDemo();
        System.out.println();
        pushAllPopAllDemo();
    }

    public static void pushAndPopDemo() {
        System.out.println("Push & Pop: ");
        GStack<Integer> test = new GStack<>(10);
        for (int i = 0; i < 10; i++) {
            test.push(i);
        }
        System.out.println("Peek: " + test.peek());
        System.out.println("Popped:");
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }

    public static void pushAllPopAllDemo() {
        System.out.println("Push All & Pop All: ");
        GStack<Integer> test2 = new GStack<>(10);
        Integer[] arr = new Integer[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = i;
        }
        test2.pushAll(arr);
        System.out.println("Peek: " + test2.peek());
        Object[] arr2 = test2.popAll();
        System.out.println("Popped: " + Arrays.toString(arr2));
    }

}
