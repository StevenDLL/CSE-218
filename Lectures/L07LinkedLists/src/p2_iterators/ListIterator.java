package p2_iterators;

public class ListIterator {
	private Link current;
	private Link previous;
	private LinkList ourList;
	
	public ListIterator(LinkList list) {
		ourList = list;
		reset();
	}
	
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
}
