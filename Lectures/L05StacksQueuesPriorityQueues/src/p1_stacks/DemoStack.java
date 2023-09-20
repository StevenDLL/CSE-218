package p1_stacks;

public class DemoStack {

	public static void main(String[] args) {
		StackX myStack = new StackX(5);
		long number = 10;
		while (!myStack.isFull()) {
			myStack.push(number);
			number += 10;
		}
		 System.out.println("Peek value: " + myStack.peek());
		
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
	}

}
