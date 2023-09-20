package p1_intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoIntro {

	public static void main(String[] args) {
		ArrayList<Name> list1 = new ArrayList();
//		list1.add(1);
//		list1.add(1.1);
		
		list1.add(new Name("M", "M"));
		list1.add(new Name("A", "Z"));
		list1.add(new Name("Z", "A"));
		
		Comparator<Name> c = (n1, n2) -> {
			return n1.getLastName().compareTo(n2.getLastName());
		};
		
		Collections.sort(list1, c);
		
		System.out.println(list1);
		
		
	}

}
