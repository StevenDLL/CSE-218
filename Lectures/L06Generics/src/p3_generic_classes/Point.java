package Lectures.L06Generics.src.p3_generic_classes;

public class Point <T extends Comparable> {
	private T x;
	private T y;
	private T[] arr;

	public Point(T x, T y) {
		super();
		arr = (T[])(new Object[10]);
		//x = new T();// erasure
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static void display(Point<? super Integer>  point) {
		System.out.println(point);
	}

}
