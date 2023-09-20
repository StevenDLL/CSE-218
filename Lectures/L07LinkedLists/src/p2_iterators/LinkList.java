package p2_iterators;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	
	public Link getFirst() {
		return first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void display() {
		Link current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println();
	}
}
