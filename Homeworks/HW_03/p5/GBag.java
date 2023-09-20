package Homeworks.HW_03.p5;

public class GBag<T> {

    private T[] arrayInBag;
    private int nElements;

    public GBag(int maxSize) {
        this.arrayInBag = (T[]) new Object[maxSize];
        this.nElements = 0;
    }

    public void insert(T itemToAdd) {
        if (this.nElements < this.arrayInBag.length) {
            for (int i = 0; i < this.arrayInBag.length; i++) {
                if (this.arrayInBag[i] == null) {
                    if (itemToAdd instanceof Integer || itemToAdd instanceof String) {
                        arrayInBag[nElements++] = itemToAdd;
                        break;
                    }
                }
            }
        }
    }

    public T remove(T itemToRemove) {
        if (itemToRemove instanceof Integer || itemToRemove instanceof String) {
            int location = sequentialSearch(itemToRemove);
            T temp = this.arrayInBag[location];
            this.arrayInBag[location] = null;
            this.nElements--;
            return temp;
        } else {
            return null;
        }
    }

    // TODO: 10/6/2021 fix this method
    public int find(T numberToFind) {
        return sequentialSearch(numberToFind);
    }

    public void display() {
        for (T t : this.arrayInBag) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }

    private int sequentialSearch(T key) {
        for (int i = 0; i < this.arrayInBag.length; i++) {
            if (key instanceof Integer || key instanceof String) {
                if (this.arrayInBag[i] != null && this.arrayInBag[i].equals(key)) {
                    return i;
                }
            }
        }
        return -1;
    }

}
