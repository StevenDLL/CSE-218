package p1_selection_sort;

public class Demo {

	public static void main(String[] args) {
		Bag theBag1 = new Bag(100000);
		for(int i = 0; i < 100000; i++) {
			theBag1.insert((int)(Math.random() * 100000));
		}
		
		Bag theBag2 = new Bag(100000);
		for(int i = 0; i < 100000; i++) {
			theBag2.insert(i);
		}
		
		long startTime = System.currentTimeMillis();
		theBag1.selectionSort();
		System.out.println(System.currentTimeMillis() - startTime);
		
		startTime = System.currentTimeMillis();
		theBag2.insertionSort();
		System.out.println(System.currentTimeMillis() - startTime);
		
//		theBag.insert(5);
//		theBag.insert(2);
//		theBag.insert(8);
//		theBag.insert(1);
//		theBag.insert(3);
//		theBag.insert(9);
//		theBag.insert(0);
//		theBag.insert(4);
//		theBag.insert(6);
//		theBag.insert(7);
		
//		theBag.display();
//		theBag.bubbleSort();
//		theBag.insertionSort();
//		theBag.display();
//		System.out.println(theBag.binarySearch(3));
//		System.out.println(theBag.sequntialSearch(3));
	}

}
