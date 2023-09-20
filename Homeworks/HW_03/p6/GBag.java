package Homeworks.HW_03.p6;

import Homeworks.HW_03.AcceptableItems;

public class GBag<T extends AcceptableItems> {
    private T[] arrayInBag;
    private int nElements;

    public GBag(int maxSize) {
        this.arrayInBag = (T[]) new Object[maxSize];
        this.nElements = 0;
    }

    public void insert(T numberToAdd) {
        if (this.nElements < this.arrayInBag.length) {
            for (int i = 0; i < this.arrayInBag.length; i++) {
                if (this.arrayInBag[i] == null) {
                    arrayInBag[nElements++] = numberToAdd;
                    break;
                }
            }
        }
    }

//    public T remove(T numberToRemove) {
//        int location = sequentialSearch(numberToRemove);
//        T temp = this.arrayInBag[location];
//        this.arrayInBag[location] = null;
//        this.nElements--;
//        return temp;
//    }
}
