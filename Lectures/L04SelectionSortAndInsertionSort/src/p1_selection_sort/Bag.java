package p1_selection_sort;

public class Bag {
	private int[] arr;
	private int nElems;

	public Bag(int maxSize) {
		arr = new int[maxSize];
		nElems = 0;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insert(int value) {
		arr[nElems++] = value;
	}

	public int sequntialSearch(int value) {
		for (int i = 0; i < nElems; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int binarySearch(int value) {
		int low = 0;
		int high = nElems - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (arr[mid] == value) {
				return mid; // found it
			} else if (arr[mid] > value) { // value, if exists, is in lower half
				high = mid - 1; // adjust the high index
			} else {     // value, if exists, is in upper half
				low = mid + 1; // adjunst the low index
			}
		}
		return -1; // value not found
	}
	
	public void bubbleSort() {
		int out;
		int in;
		for(out = nElems-1; out >= 1; out--) {
			for(in = 0; in < out; in++) {
				if(arr[in] > arr[in + 1]) {
					swap(in, in+1);
				}
			}
		}
	}

	public void selectionSort() {
		int out;
		int in;
		int min;
		for (out = 0; out < nElems - 1; out++) {
			min = out;
			for (in = out + 1; in < nElems; in++) {
				if (arr[in] < arr[min]) {
					min = in;
				}
			}
			swap(out, min);
		}
	}

	public void insertionSort() {
		int in;
		int out;
		for (out = 1; out < nElems; out++) {
			int temp = arr[out];
			in = out;
			while (in > 0 && arr[in - 1] >= temp) {
				arr[in] = arr[in - 1];
				in--;
			}
			arr[in] = temp;
		}
	}

	private void swap(int one, int two) {
		int temp = arr[one];
		arr[one] = arr[two];
		arr[two] = temp;
	}
}
