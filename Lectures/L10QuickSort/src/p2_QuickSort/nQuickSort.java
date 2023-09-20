package Lectures.L10QuickSort.src.p2_QuickSort;

public class nQuickSort {

    private long[] arr;
    private int nElems;

    public nQuickSort(int maxsize) {
        this.arr = new long[maxsize];
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            long pivot = arr[right];
            int partition = partition(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    public int partition(int left, int right, long pivot) {
        int leftPtr = left - 1; //left pointer
        int rightPtr = right + 1; //right pointer

        while (true) {
            while (leftPtr < right && arr[++leftPtr] < pivot) {
                ; // finish this
            }

            while (rightPtr > left && arr[--rightPtr] >= pivot) {
                ; // finish this
            }

            if (leftPtr >= rightPtr) { //if the left pointer is equal to or greater than the right pointer then you finally break out of the while-loop
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return rightPtr;
    }

    private void swap(int leftPtr, int rightPtr) {
        long temp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = temp;
    }

    public void insert(long value) {
        arr[nElems++] = value;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return nElems;
    }

}
