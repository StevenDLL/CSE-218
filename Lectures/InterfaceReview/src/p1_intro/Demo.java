package Lectures.InterfaceReview.src.p1_intro;

public class Demo {

	public static void main(String[] args) {
		Duck d1 = new Duck("Billy");
		d1.swim();
		Flyable.walk();
		d1.fly();
		d1.run();
	}

}
