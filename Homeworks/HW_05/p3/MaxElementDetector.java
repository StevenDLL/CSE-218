package Homeworks.HW_05.p3;

public class MaxElementDetector {
    public static Integer largestValue(Integer[] arrayOfIntegers, int max, int index) {
        if (arrayOfIntegers.length == 1) {
            return arrayOfIntegers[0];
        } else if (arrayOfIntegers.length > 1) {
            if (index < arrayOfIntegers.length) {
                if (arrayOfIntegers[index] > max) {
                    max = arrayOfIntegers[index];
                }
                return largestValue(arrayOfIntegers, max, index + 1);
            } else {
                return max;
            }
        }
        return null;
    }
}
