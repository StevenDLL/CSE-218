package Homeworks.HW_02.p3;

import java.util.ArrayList;

public class StringStack {
    private ArrayList<Character> arrayInStringStack;

    public StringStack() {
        this.arrayInStringStack = new ArrayList<>();
    }

    public StringStack(int initialCapacity) {
        this.arrayInStringStack = new ArrayList<>(initialCapacity);
    }

    public void push(Character c) {
        this.arrayInStringStack.add(c);
    }

    public Character pop() {
        if (!isEmpty()) {
            Character c = this.arrayInStringStack.get(arrayInStringStack.size() - 1);
            this.arrayInStringStack.remove(arrayInStringStack.size() - 1);
            return c;
        } else {
            return '0';
        }

    }

    public Character peek() {
        return this.arrayInStringStack.get(arrayInStringStack.size() - 1);
    }

    public int size() {
        return this.arrayInStringStack.size();
    }

    public boolean isEmpty() {
        return this.arrayInStringStack.isEmpty();
    }

}
