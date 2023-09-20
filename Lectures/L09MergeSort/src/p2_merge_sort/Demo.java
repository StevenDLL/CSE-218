package p2_merge_sort;

public class Demo {

	public static void main(String[] args) {
		MergeSortArray theArray = new MergeSortArray(100);
		theArray.insert(64);
		theArray.insert(21);
		theArray.insert(33);
		theArray.insert(70);
		theArray.insert(12);
		theArray.insert(85);
		theArray.insert(44);
		theArray.insert(3);
		theArray.display();
		
		theArray.mergeSort();
		
		theArray.display();
		
	}

}
