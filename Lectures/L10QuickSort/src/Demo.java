package Lectures.L10QuickSort.src;

import Lectures.L10QuickSort.src.p1_partition.ArrayPar;
import Lectures.L10QuickSort.src.p2_QuickSort.nQuickSort;

public class Demo {
    public static void main(String[] args) {
        nQuickSort arr = new nQuickSort(10);
        arr.insert(4);
        arr.insert(1);
        arr.insert(3);
        arr.insert(123);
        arr.insert(24);
        arr.insert(11);
        arr.insert(3);
        arr.insert(5);
        arr.insert(7);
        arr.insert(8);

        arr.display();

        //int partition = arr.partition(0, arr.size() - 1, 24);
        //System.out.println(partition);

        arr.quickSort();

        arr.display();

    }
}
