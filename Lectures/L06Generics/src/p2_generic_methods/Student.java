package p2_generic_methods;

import java.util.Objects;

public class Student implements Comparable<Student>{
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
	public int hashCode() {
		return Objects.hash(age, gpa, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}
