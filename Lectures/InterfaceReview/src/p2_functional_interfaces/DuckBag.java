package Lectures.InterfaceReview.src.p2_functional_interfaces;

import java.util.function.Predicate;

public class DuckBag {
	private Duck[] arr;
	private int nElems;
	
	public DuckBag(int maxSize) {
		arr = new Duck[maxSize];
	}
	
	public void insert(Duck duck) {
		arr[nElems++] = duck;
	}
	
	public Duck search(Predicate<Duck> predicate) {
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				return arr[i];
			}
		}
		return null;
		
	}
	
	public Duck searchByName(String name) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getName().equals(name)) {
				return arr[i];
			}
		}
		return null;
	}

	public Duck searchByWeight(double weight) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getWeight() == weight) {
				return arr[i];
			}
		}
		return null;
	}

	public Duck searchByAge(int age) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getAge() == age) {
				return arr[i];
			}
		}
		return null;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
