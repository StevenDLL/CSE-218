package p2_iterators;

public class Link {
	public Link next;
	public long dData;
	
	public Link(long dData) {
		this.dData = dData;
	}
	
	public void display() {
		System.out.print(dData + " ");
	}
}
