package Lectures.L10QuickSort.src.p1_partition;

public class ArrayPar {
    private long[] theArray;
    private int nElems;

    public ArrayPar(int maxSize) {
        theArray = new long[maxSize];
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1; //left pointer
        int rightPtr = right + 1; //right pointer

        while (true) {
            while (leftPtr < right && theArray[++leftPtr] < pivot) {
                ; // nop
            }

            while (rightPtr > left && theArray[--rightPtr] >= pivot) {
                ; // nop
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
        long temp = theArray[leftPtr];
        theArray[leftPtr] = theArray[rightPtr];
        theArray[rightPtr] = temp;
    }

    public void insert(long value) {
        theArray[nElems++] = value;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return nElems;
    }

}
