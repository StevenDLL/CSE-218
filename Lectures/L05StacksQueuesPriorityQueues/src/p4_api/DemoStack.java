package p4_api;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 3.9);
		Student s2 = new Student("B", 4.0);
		Student s3 = new Student("M", 2.5);

//		Stack<Student> myStack = new Stack<>();
//		myStack.push(s1);
//		myStack.push(s2);
//		myStack.push(s3);
		
		Stack<Double> myStack = new Stack<>(); // generics
		myStack.push(3.0);
		myStack.push(4.0);
		myStack.push(5.0);

		while (!myStack.empty()) {
			System.out.println(myStack.pop());
		}
		
		
	}

}
