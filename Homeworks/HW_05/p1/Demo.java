package Homeworks.HW_05.p1;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //P1
        MemberCheck memberCheck = new MemberCheck();
        Integer[] arr = createArray(100, 1000);
        System.out.println(Arrays.toString(arr));
        System.out.println(memberCheck.isMember(arr, arr[32], 0));
    }

    public static Integer[] createArray(int size, int range) {
        Integer[] arr = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(range++);
        }
        return arr;
    }
}
