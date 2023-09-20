package p1;

public class ArrayBub {
	private int[] a;
	private int nElems; // actual data items
	
	public ArrayBub(int maxSize) {
		a = new int[maxSize];
		nElems = 0;
	}
	
	public void bubbleSort() {
		int out;
		int in;
		for(out = nElems-1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				if(a[in] > a[in + 1]) {
					swap(in, in+1);
				}
			}
		}
	}
	
	private void swap(int one, int two) {
		int temp =a[one];
		a[one] = a[two];
		a[two] = temp;
	}

	public void insert(int value) {
		a[nElems++] = value;
	}
	
	public void display() {
		for(int i =0; i < nElems; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
}
