package Lectures.PredicateDemo.src;

import Lectures.InterfaceReview.src.p2_functional_interfaces.Student;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
//		Student s1 = new Student("G");
//		Student s2 = new Student("D");
//		Student s3 = new Student("G");
//		Student s4 = new Student("C");
		
		StudentBag theBag = new StudentBag(100);
//		theBag.insert(s1);
//		theBag.insert(s2);
//		theBag.insert(s3);
//		theBag.insert(s4);
		
		theBag.display();
		
//		Predicate<Student> predicateById = new Predicate<Student> () {
//
//			@Override
//			public boolean test(Student s) {
//				return s.getId().equals("1");
//			}
//			
//		};
//		
//		Predicate<Student> predicateById = (Student s) -> {
//			return s.getId().equals("2");
//		};
//		
//		Predicate<Student> predicateByName = new Predicate<Student> () {
//
//			@Override
//			public boolean test(Student s) {
//				return s.getName().equals("G");
//			}
//			
//		};
//		
//		Predicate<Student> predicateByName = (Student s) -> {
//			return s.getName().equals("G");
//		};
		
//		Student[] itemsFound1 = theBag.search((Student s) -> {
//			return s.getId().equals("2");
//		});
//		System.out.println("Item found by ID: " + Arrays.toString(itemsFound1));
//
//		Student[] itemsFound2 = theBag.search((s) -> {
//			return s.getName().equals("G");
//		});
//
//		System.out.println("Items found by name: " + Arrays.toString(itemsFound2));
		
	}

}
