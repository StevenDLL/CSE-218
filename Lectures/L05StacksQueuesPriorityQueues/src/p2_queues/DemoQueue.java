package p2_queues;

public class DemoQueue {

	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		System.out.println(theQueue.remove());
		System.out.println(theQueue.remove());
		System.out.println(theQueue.remove());
		System.out.println(theQueue.size());
		
		theQueue.insert(50);
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while(!theQueue.isEmpty()) {
			System.out.println(theQueue.remove());
		}
		
	}

}
