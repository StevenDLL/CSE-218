package p1_simple_linkedLists;

public class Demo {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insertFirst(1, 1.1);
		list1.insertFirst(2, 2.2);
		list1.insertFirst(3, 3.3);
		list1.displayList();
		System.out.println();
		
		list1.delete(1.1);
		list1.displayList();
//		while (!list1.isEmpty()) {
//			list1.deleteFirst().displayLink();
//		}

	}

}
