package Lectures.BinarySearch.src.p1;

public class Demo {
    private static int low = 0;
    private static int high = 4;

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 10, 19};
        System.out.println("" + binarySearch(numbers, 19));
    }

    public static int binarySearch(int[] a, int key) {
//		int low = n1;
//		int high = n2;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                high = mid - 1;
                return binarySearch(a, key);
            } else {
                low = mid + 1;
                return binarySearch(a, key);
            }
        }

        return -1;
    }

}
