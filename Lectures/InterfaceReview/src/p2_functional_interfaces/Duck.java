package Lectures.InterfaceReview.src.p2_functional_interfaces;

public class Duck {
	private String name;
	private double weight;
	private int age;

	public Duck(String name, double weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}

//	@Override
//	public void fly() {
//		System.out.println("Flying!");
//	}
//	

}
