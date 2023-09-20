package Lectures.InterfaceReview.src.p2_functional_interfaces;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		Duck d1 = new Duck("Joey", 2.5, 3);
		Duck d2 = new Duck("Alan", 3.5, 4);
		Duck d3 = new Duck("Julie", 1.5, 1);

		DuckBag myBag = new DuckBag(10);
		myBag.insert(d1);
		myBag.insert(d2);
		myBag.insert(d3);

		Predicate<Duck> predicateByName = new Predicate<>() {

			@Override
			public boolean test(Duck t) {
				return t.getName().equals("Julie");
			}

		};
		
		Predicate<Duck> predicateByWeight = new Predicate<>() {

			@Override
			public boolean test(Duck t) {
				return t.getWeight() == 1.5;
			}

		};
		
		Predicate<Duck> predicateByAge = new Predicate<>() {

			@Override
			public boolean test(Duck t) {
				return t.getAge() == 3;
			}

		};
		
		System.out.println(myBag.search(predicateByAge));

//		System.out.println(myBag.search((d) -> {
//			return d.getName().equals("Alan");
//		}));
//
//		System.out.println(myBag.search((d) -> {
//			return d.getWeight() == 1.5;
//		}));
//
//		System.out.println(myBag.search((d) -> {
//			return d.getAge() == 3;
//		}));
	}

}
