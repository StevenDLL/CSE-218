package p1_O_1;

public class Demo {

	public static void main(String[] args) {
		for(int i = 10; i <= 100; i=i+10) {
			int[] a = new int[i];
			for(int j = 0; j < (i-1); j++) {
				a[j] =(int) (Math.random() * 100);
			}
			long start = System.nanoTime();
			int result = a[(int)(Math.random() * a.length)];
			long timeSpent = System.nanoTime() - start;
			System.out.println(timeSpent);
		}
	}

}
