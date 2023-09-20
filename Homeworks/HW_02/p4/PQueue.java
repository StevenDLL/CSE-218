package Homeworks.HW_02.p4;

public class PQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long value) {
        int j;
        if(nItems == 0) {    // insert directly when empty
            queArray[nItems++] = value;
        } else {					// find the right spot by shifting smaller ones up
            for(j=nItems-1; j>= 0; j--) {
                if(value > queArray[j]) {
                    queArray[j+1] = queArray[j];
                } else {
                    break;
                }
            }
            queArray[j+1] = value; // insertion
            nItems++;
        }
    }

    public long remove() {
        return queArray[--nItems];
    }


    public long peekMin() {
        return queArray[nItems-1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }

}
