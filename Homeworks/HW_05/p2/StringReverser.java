package Homeworks.HW_05.p2;

public class StringReverser {
    public static String reverseString(String stringToReverse) {
        if (stringToReverse.isEmpty()) {
            return stringToReverse;
        }
        return reverseString(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }
}
