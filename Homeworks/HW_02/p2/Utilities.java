package Homeworks.HW_02.p2;

public class Utilities {

    public static boolean isPalindrome(String string) {
        StringStack myStack = new StringStack();
        String str = string.replaceAll("\\s", "").toLowerCase();
        Character[] defaultChars = new Character[str.length()];
        for (int i = 0; i < defaultChars.length; i++) {
            defaultChars[i] = str.charAt(i);
            myStack.push(defaultChars[i]);
        }
        for (int i = 0; i < defaultChars.length; i++) {
            if (defaultChars[i] != myStack.pop()) {
                return false;
            }
        }
        return true;
    }

}
