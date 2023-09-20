package Lectures.InterfaceReview.src.p2_functional_interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class GBag <E extends Unitable >{

	private E[] arr;
	private int nElems;
	
	public GBag(int maxSize) {
		arr = (E[])new Object[maxSize];
	}
	
	public void insert(E e) {
		arr[nElems++] = e;
	}
	
	public void display() {
		for(int i  = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public ArrayList<E> search(Predicate<E> predicate) {
		ArrayList<E> resultList = new ArrayList<>();
		for(int i = 0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				resultList.add(arr[i]);
			}
		}
		return resultList;
	}
	
	public ArrayList<E> remove(Predicate<E> predicate) {
		ArrayList<E> itemsFound = new ArrayList<>();
		
		for(int i  =0; i < nElems; i++) {
			if(predicate.test(arr[i])) {
				itemsFound.add(arr[i]);
			}
		}
		
		return itemsFound;
	}
}
