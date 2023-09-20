package p1_o_n;

public class Demo {

	public static void main(String[] args) {
		for(int i = 1000; i <= 10000; i=i+1000) {
			int[] a = new int[i];
			for(int j = 0; j < (i-1); j++) {
				a[j] =(int) (Math.random() * 1000000);
			}
			long totalTimeSpent = 0;
			for (int k = 0; k < 1000; k++) {
				long start = System.nanoTime();
				int indexFound = find(a, (int) (Math.random() * 1000000));
				totalTimeSpent += (System.nanoTime() - start);
			}
			System.out.println(totalTimeSpent/1000);
		}
	}
	
	public static int find(int[] a, int x) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
