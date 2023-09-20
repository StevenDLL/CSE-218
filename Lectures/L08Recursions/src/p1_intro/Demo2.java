package p1_intro;

public class Demo2 {
	private static int counter = 0;

	public static void main(String[] args) {
		message(counter);
		System.out.println("The End");
	}

	private static void message(int counter) {
		if(counter == 10) { // base case
			return;
		}
		System.out.println(counter);
		counter++;
		message(counter);
		System.out.println("End the message method.");
		
	}

}
