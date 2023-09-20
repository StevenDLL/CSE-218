package Lectures.InterfaceReview.src.p2_functional_interfaces;

public interface Flyable { // functional interface: only one method not implemented.
	void fly(); // method header, no body
//	void run();

	public static void walk() {
		System.out.println("Walking!");
	}

	public default void swim() {
		System.out.println("Swimming!");
	}

}
