package Homeworks.HW_05.p4;

public class PalindromeDetector {
    public static boolean checkPalindrome(String stringToCheck) {
        String newString = stringToCheck.toLowerCase();
        if (newString.length() <= 1) {
            return true;
        }
        if (newString.charAt(0) == newString.charAt(newString.length() - 1)) {
            return checkPalindrome(newString.substring(1, newString.length() - 1));
        }
        return false;
    }
}
