package Homeworks.HW_02.p1;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> arrayInStack;

    public MyStack() {
        this.arrayInStack = new ArrayList<>();
    }

    public MyStack(int initialCapacity) {
        this.arrayInStack = new ArrayList<>(initialCapacity);
    }

    public void push(int value) {
        this.arrayInStack.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            int value = this.arrayInStack.get(arrayInStack.size() - 1);
            this.arrayInStack.remove(arrayInStack.size() - 1);
            return value;
        } else {
            return -1;
        }

    }

    public int peek() {
        return this.arrayInStack.get(arrayInStack.size() - 1);
    }

    public int size() {
        return this.arrayInStack.size();
    }

    public boolean isEmpty() {
        return this.arrayInStack.isEmpty();
    }
}
