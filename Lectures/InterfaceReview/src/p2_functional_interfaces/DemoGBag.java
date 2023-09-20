package Lectures.InterfaceReview.src.p2_functional_interfaces;

public class DemoGBag {

	public static void main(String[] args) {
		GBag<Student> studentBag = new GBag<>(100);
		studentBag.insert(new Student());
		
//		studentBag.search((Student s) -> {
//			return s.getName().equals("Billy");
//		});
	}

}
