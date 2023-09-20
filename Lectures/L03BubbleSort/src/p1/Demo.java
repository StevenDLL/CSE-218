package p1;

public class Demo {

	public static void main(String[] args) {
		for (int numberOfDataItems = 100; numberOfDataItems < 1000; numberOfDataItems = numberOfDataItems + 100) {
			ArrayBub arr = new ArrayBub(numberOfDataItems);
			for (int i = 0; i < numberOfDataItems; i++) {
				arr.insert((int) (Math.random() * 10000));
			}

//			arr.display();
			System.out.println();

			long startTime = System.nanoTime();
			arr.bubbleSort();
			long endTime = System.nanoTime();
			System.out.println((endTime - startTime) + " nano seconds for " + numberOfDataItems + " numbers");

//			arr.display();
		}
	}

}
