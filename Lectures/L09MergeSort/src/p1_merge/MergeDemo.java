package p1_merge;

public class MergeDemo {

	public static void main(String[] args) {
		int[] arrayA = { 2, 14, 56, 78 };
		int[] arrayB = { 5, 23, 25, 45 };
		int[] arrayC = new int[arrayA.length + arrayB.length];

		merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		display(arrayC, arrayC.length);
	}

	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		while (aIndex < sizeA && bIndex < sizeB) { // neither arrays are finished
			if (arrayA[aIndex] < arrayB[bIndex]) {
				arrayC[cIndex++] = arrayA[aIndex++];
			} else {
				arrayC[cIndex++] = arrayB[bIndex++];
			}
		}
		
		while(aIndex < sizeA) { // arrayB is done
			arrayC[cIndex++] = arrayA[aIndex++];
		}
		
		while(bIndex < sizeB) { // arrayA is done
			arrayC[cIndex++] = arrayB[bIndex++];
		}
	}

	private static void display(int[] arrayC, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arrayC[i] + " ");
		}
		System.out.println();
	}

}
