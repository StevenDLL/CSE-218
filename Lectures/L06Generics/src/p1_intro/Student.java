package p1_intro;

public class Student {
	private String name;
	private double gpa;
	private int age;

	public Student(String name, double gpa, int age) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", age=" + age + "]";
	}

}
