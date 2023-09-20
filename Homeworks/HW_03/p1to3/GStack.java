package Homeworks.HW_03.p1to3;

public class GStack<T> {

    private T[] arrayInGenericStack;
    private int top;
    private int maxSize;

    public GStack(int maxSize) {
        this.arrayInGenericStack = (T[]) new Object[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
    }

    public void push(T itemToPush) {
        if (this.top + 1 != maxSize) {
            this.arrayInGenericStack[++this.top] = itemToPush;
        }
    }

    public void pushAll(T[] itemsToPush) {
        for (T t : itemsToPush) {
            if (isFull()) {
                T[] newSizeArray = (T[]) new Object[this.arrayInGenericStack.length * 2];
                System.arraycopy(this.arrayInGenericStack, 0, newSizeArray, 0, this.arrayInGenericStack.length);
                this.arrayInGenericStack = newSizeArray;
                this.maxSize = newSizeArray.length;
            }
            push(t);
        }
    }

    public T pop() {
        if (this.top >= 0) {
            return this.arrayInGenericStack[this.top--];
        } else {
            return null;
        }
    }

    public T[] popAll() {
        T[] itemsPopped = (T[]) (new Object[this.maxSize]);
        for (int i = 0; i < this.maxSize; i++) {
            itemsPopped[i] = pop();
        }
        return itemsPopped;
    }

    public T peek() {
        return this.arrayInGenericStack[this.top];
    }

    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

}
