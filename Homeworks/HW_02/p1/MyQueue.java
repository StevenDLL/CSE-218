package Homeworks.HW_02.p1;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> arrayInQueue;
    private int nElements;

    public MyQueue() {
        this.arrayInQueue = new ArrayList<>();
        this.nElements = 0;
    }

    public MyQueue(int initialCapacity) {
        this.arrayInQueue = new ArrayList<>(initialCapacity);
        this.nElements = 0;
    }

    public int peek() {
        return this.arrayInQueue.get(0);
    }

    public void insert(int value) {
        this.arrayInQueue.add(value);
        this.nElements++;
    }

    public int remove() {
        this.nElements--;
        return this.arrayInQueue.remove(0);
    }

    public boolean isEmpty() {
        return this.nElements == 0; // Or could use arrayInQueue.isEmpty();
    }

    public int size() {
        return this.nElements; // Or could use arrayInQueue.size();
    }


}
