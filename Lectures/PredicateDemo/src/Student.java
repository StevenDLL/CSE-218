
public class Student {
	private String name;
	private String id;

	private static int idCount = 0;

	public Student(String name) {
		this.name = name;
		id = String.valueOf(++idCount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

}
