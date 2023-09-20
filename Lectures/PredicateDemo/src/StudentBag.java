package Lectures.PredicateDemo.src;

import Lectures.InterfaceReview.src.p2_functional_interfaces.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StudentBag {
	private Student[] arr;
	private int nElems;

	public StudentBag(int maxSize) {
		arr = new Student[maxSize];
		nElems = 0;
	}

//	public Student[] remove(Predicate predicate) {
//
//	}

//	public ArrayList<Student> remove(Predicate predicate) {
//
//	}

	public Student[] search(Predicate<Student> predicate) {
		Student[] temp = new Student[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				temp[count++] = arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public void insert(Student s) {
		arr[nElems++] = s;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
