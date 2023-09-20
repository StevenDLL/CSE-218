package Homeworks.HW_03.p4;

public class NumberBag<T extends Number> {
    private T[] arrayInNumberBag;
    private int nElements;

    public NumberBag(int maxSize) {
        this.arrayInNumberBag = (T[]) new Number[maxSize];
        this.nElements = 0;
    }

    public void insert(T numberToAdd) {
        if (this.nElements < this.arrayInNumberBag.length) {
            for (int i = 0; i < this.arrayInNumberBag.length; i++) {
                if (this.arrayInNumberBag[i] == null) {
                    arrayInNumberBag[nElements++] = numberToAdd;
                    break;
                }
            }
        }
    }

    public T remove(T numberToRemove) {
        int location = sequentialSearch(numberToRemove);
        T temp = this.arrayInNumberBag[location];
        this.arrayInNumberBag[location] = null;
        this.nElements--;
        return temp;
    }

    public int find(T numberToFind) {
        return sequentialSearch(numberToFind);
    }

    public void display() {
        for (int i = 0; i < this.nElements; i++) {
            System.out.println(this.arrayInNumberBag[i]);
        }
    }

    private int sequentialSearch(T key) {
        for (int i = 0; i < this.arrayInNumberBag.length; i++) {
            if (this.arrayInNumberBag[i] != null && this.arrayInNumberBag[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

}
