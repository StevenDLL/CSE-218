package p1_simple_linkedLists;

public class LinkedList {
	private Link first;

	public LinkedList() {
		first = null;
	}
	
	public Link find(int key) {
		Link current = first;
		while(current.getiData() != key) {
			if(current.getNext() == null) {
				return null; // no match
			} else {
				current = current.getNext(); // move down the list
			}
		}
		
		return current; // return the match
	}

	public Link delete(double key) {
		Link current = first;
		Link previous = first;

		while (current.getdData() != key) {
			if (current.getNext() == null) {
				return null;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		// a match is found
		if (current == first) { // current is the match
			first = first.getNext();
		} else {
			previous.setNext(current.getNext());
		}
		
		return current;
	}

	public void displayList() {
		System.out.println("First --> Last");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.getNext();
		}
	}

	public void insertFirst(int iData, double dData) {
		Link newLink = new Link(iData, dData);
		newLink.setNext(first);
		first = newLink;
	}

	public Link deleteFirst() {
		Link temp = first;
		first = first.getNext();
		return temp;
	}

	public boolean isEmpty() {
		return first == null;
	}
}
