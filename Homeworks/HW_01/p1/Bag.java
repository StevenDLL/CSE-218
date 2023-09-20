package Homeworks.HW_01.p1;

import java.util.Arrays;
import java.util.Random;

public class Bag {
    private int[] arrayInBag;
    private int nElements;

    public Bag() {
        arrayInBag = new int[1000];
        nElements = 0;
    }

    public void insertNumber(int number) {
        arrayInBag[nElements++] = number;
    }

    public void fillArrayInBag(int amountOfNumbers) {
        if (amountOfNumbers <= arrayInBag.length) {
            for (int i = 0; i < amountOfNumbers; i++) {
                insertNumber(new Random().nextInt(1000001));
            }
        }
    }

    public int[] getNumbersInArray() {
        int[] tempItems = new int[20];
        for (int i = 0; i < tempItems.length; i++) {
            tempItems[i] = arrayInBag[new Random().nextInt(nElements - 1)];
        }
        return tempItems;
    }

    public int doSequentialSearch(int key) {
        for (int i = 0; i < nElements; i++) {
            if (arrayInBag[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int doBinarySearch(int key) {
        int start = 0;
        int end = nElements - 1;
        while (end >= start) {
            int middle = (start + end) / 2;
            if (arrayInBag[middle] == key) {
                return middle;
            } else if (arrayInBag[middle] > key) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }

    public void doBasicSorting(){
        Arrays.sort(arrayInBag);
    }
}
