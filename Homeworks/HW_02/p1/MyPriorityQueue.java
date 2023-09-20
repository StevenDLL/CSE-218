package Homeworks.HW_02.p1;

import java.util.ArrayList;

public class MyPriorityQueue {
    private ArrayList<Integer> arrayInPriorityQueue;
    private int nElements;

    public MyPriorityQueue() {
        this.arrayInPriorityQueue = new ArrayList<>();
        this.nElements = 0;
    }

    public MyPriorityQueue(int initialCapacity) {
        this.arrayInPriorityQueue = new ArrayList<>(initialCapacity);
        this.nElements = 0;
    }

    public void insert(int value) {

        if (this.isEmpty()) {
            arrayInPriorityQueue.add(0, value);
            nElements++;
        } else {
            for (int i = nElements - 1; i >= 0; i--) {
                if (value > arrayInPriorityQueue.get(i)) {
                    arrayInPriorityQueue.add(i + 1, value);
                    nElements++;
                    break;
                } else if (i == 0) {
                    arrayInPriorityQueue.add(0, value);
                    nElements++;
                }
            }
        }
    }

    public int remove() {
        return this.arrayInPriorityQueue.remove(0);
    }

    public int peekAtMinimum() {
        return this.arrayInPriorityQueue.get(0);
    }

    public boolean isEmpty() {
        return this.nElements == 0;
    }

    public int size() {
        return this.nElements;
    }

    public void printValues() {
        System.out.println(this.arrayInPriorityQueue.toString());
    }

}
