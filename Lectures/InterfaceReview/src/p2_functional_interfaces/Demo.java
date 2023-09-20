package Lectures.InterfaceReview.src.p2_functional_interfaces;

public class Demo {

	public static void main(String[] args) {
		Duck d1 = new Duck("Joey", 2.5, 3);
		Duck d2 = new Duck("Alan", 3.5, 4);
		Duck d3 = new Duck("Julie", 1.5, 1);
		
		DuckBag myBag = new DuckBag(10);
		myBag.insert(d1);
		myBag.insert(d2);
		myBag.insert(d3);
		
		System.out.println(myBag.searchByName("Alan"));
		System.out.println(myBag.searchByWeight(1.5));
		System.out.println(myBag.searchByAge(3));
		
		
////		d1.fly();
//		d1.swim();
//		Flyable.walk();
//		Flyable aFly = new Flyable() {
//
//			@Override
//			public void fly() {
//				System.out.println("Flying!");
//			}
//			
//		};
//		
//		aFly.fly();
		
//		Flyable aFly = () -> {
//			System.out.println("Flying");
//		};
//		
//		aFly.fly();
	}

}
