package Lectures.L06Generics.src.p1_intro;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int x = 5;
        int[] numbers = {1, 2, 3, 4};
        change(x);
        change(numbers);
        System.out.println("Hello World! " + x);
        System.out.println("Hello World! " + Arrays.toString(numbers));
        System.out.println("The End");
    }

    public static void change(int[] numbers) {
        numbers[0] = numbers[0] * 20;
        System.out.println("From the change method: " + Arrays.toString(numbers));
    }

    public static void change(int y) {
        y = 2 * y;
        System.out.println(y);
    }
}
