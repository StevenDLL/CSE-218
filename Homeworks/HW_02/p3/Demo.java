package Homeworks.HW_02.p3;

public class Demo {
    public static void main(String[] args) {

        //BALANCED STRING
        String strToCheck1 = """
                public static boolean isPalindrome(String string) {
                        StringStack myStack = new StringStack();
                        String str = string.replaceAll("\\\\s", "").toLowerCase();
                        Character[] defaultChars = new Character[str.length()];
                        for (int i = 0; i < defaultChars.length; i++) {
                            defaultChars[i] = str.charAt(i);
                            myStack.push(defaultChars[i]);
                        }
                        for (int i = 0; i < defaultChars.length; i++) {
                            if (defaultChars[i] == myStack.pop()) {
                            } else {
                                return false;
                            }
                        }
                        return true;
                    }""";

        //UNBALANCED STRING
        String strToCheck2 = """
                public static boolean isPalindrome(String string) {
                        StringStack myStack = new StringStack();
                        String str = string.replaceAll("\\\\s", "").toLowerCase();
                        Character[] defaultChars = new Character[str.length()];
                        for (int i = 0; i < defaultChars.length; i++) {
                            defaultChars[i] = str.charAt(i);
                            myStack.push(defaultChars[i]);
                        }
                        for (int i = 0; i < defaultChars.length; i++) {
                            if (defaultChars[i] == myStack.pop()) {
                            } else {
                                return false;
                            }
                        }}}}}}}}}}}}}}}}}}}}
                        return true;
                    }""";

        System.out.println(BalanceChecker.isBalanced(strToCheck1));
        System.out.println(BalanceChecker.isBalanced(strToCheck2));
    }
}
