package Lectures.InterfaceReview.src.p1_intro;

public class Duck implements Flyable {
	private String name;
	

	public Duck(String name) {
		super();
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("Flying!");
	}

	@Override
	public void run() {
		System.out.println("Running!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sit() {
		System.out.println("Sitting!");
	}

}
