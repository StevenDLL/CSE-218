package Lectures.InterfaceReview.src.p1_intro;

public interface Flyable {
	void fly(); // method header, no body
	void run();

	public static void walk() {
		System.out.println("Walking!");
	}

	public default void swim() {
		System.out.println("Swimming!");
	}

}
