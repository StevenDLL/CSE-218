package p4_api;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 3.9);
		Student s2 = new Student("B", 4.0);
		Student s3 = new Student("M", 2.5);

		Queue<Student> myQueue = new ArrayBlockingQueue<>(10);
		myQueue.add(s1);
		myQueue.add(s2);
		myQueue.add(s3);
		
		while(!myQueue.isEmpty()) {
			System.out.println(myQueue.remove());
		}
	}

}
