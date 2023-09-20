
public class GBag <E extends Number>{
	private E[] arr;
	private int nElems;
	
	public GBag(int maxSize) {
		arr = (E[]) new Number[maxSize];
	}
}
