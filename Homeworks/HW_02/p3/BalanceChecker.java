package Homeworks.HW_02.p3;

public class BalanceChecker {
    public static boolean isBalanced(String program) {

        StringStack stack = new StringStack(); //THIS IS THE SAME STACK AS QUESTION 2, DIDNT MAKE A NEW ONE CAUSE THIS ONE SEEMS TO DO THE TRICK.
        String newString = stripString(program);
        if (newString.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < newString.length(); i++) {
            char ch = newString.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }

        return true;
    }


    private static String stripString(String str) {
        return str.replaceAll("[^(){}\\[\\]]", "");
    }

}
