package p2_generic_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Z", 2.0, 19);
		Student s2 = new Student("A", 3.0, 29);
		Student s3 = new Student("M", 1.0, 9);
		Student s4 = new Student("M", 1.0, 9);
		Student[] students = { s1, s2, s3 };
		
		Name n1 = new Name("M", "A");
		Name n2 = new Name("Z", "M");
		Name n3 = new Name("A", "Z");
		Name n4 = new Name("Z", "M");
		
		Name[] names = {n1, n2, n3};

		ArrayList<Name> list1 = new ArrayList<>();
		list1.add(new Name("M", "A"));
		list1.add(new Name("Z", "M"));
		list1.add(new Name("A", "Z"));
		
//		System.out.println(searchArray(names, n4));
//		System.out.println(searchArray(students, s4));

//		Comparator<Name> c4fn = (Name o1, Name o2) -> {
//			return o1.getFirstName().compareTo(o2.getFirstName());
//		};
//
//		Comparator<Name> c4ln = (Name o1, Name o2) -> {
//			return o1.getLastName().compareTo(o2.getLastName());
//		};
//
//		Collections.sort(list1, c4ln);
		Collections.sort(list1);
//		System.out.println(list1);

//		Comparator<Name> c4fn = new Comparator<>() {
//
//			@Override
//			public int compare(Name o1, Name o2) {
//				return o1.getFirstName().compareTo(o2.getFirstName());
//			}
//
//		};

//		Comparator<Name> c4ln = new Comparator<>() {
//
//			@Override
//			public int compare(Name o1, Name o2) {
//				return o1.getLastName().compareTo(o2.getLastName());
//			}
//
//		};

//	Arrays.sort(names,c4fn);Arrays.sort(names,c4ln);

//		Arrays.sort(names, (Name n1, Name n2) -> {
//			return n1.getFirstName().compareTo(n2.getFirstName());
//		});

//	System.out.println(Arrays.toString(names));
		
		Integer[] numberes = {2, 5, 2, 1};
		String[] strs = {"Adam", "Bill", "Cathy"};
		displayArray(strs);

//		displayArray(names);
//		System.out.println(searchArray(names, new Name("Z", "M")));
//		System.out.println();
//		displayArray(students);
//		System.out.println(searchArray(students, new Student("M", 0.0, 40)));
//	System.out.println(s1.equals(new Student("Z",2.0,19)));

	}

	public static <E extends Comparable> void displayArray(E[] a) { // upper bound constraint
		for(E e : a) {
			System.out.println(e);
		}
	}
//	
	public static <E extends Comparable> int searchArray(E[] arr, E key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

//	public static void displayArray(Object[] a) {
//		for(Object e : a) {
//			System.out.println(e);
//		}
//	}

//	public static void displayArray(Name[] names) {
//		for(Name n : names) {
//			System.out.println(n);
//		}
//	}
//	
//	public static void displayArray(Student[] students) {
//		for(Student s : students) {
//			System.out.println(s);
//		}
//	}
}
