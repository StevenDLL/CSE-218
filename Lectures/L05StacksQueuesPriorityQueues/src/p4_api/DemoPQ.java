package p4_api;

import java.util.PriorityQueue;

public class DemoPQ {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 3.9);
		Student s2 = new Student("B", 4.0);
		Student s3 = new Student("M", 2.5);

		PriorityQueue<Student> pq = new PriorityQueue<>(); // heap
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
