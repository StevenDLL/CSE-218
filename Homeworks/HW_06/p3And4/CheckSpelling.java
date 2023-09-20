package Homeworks.HW_06.p3And4;

import java.util.Arrays;

public class CheckSpelling {
    public static String checkSpelling(String inputText, DataHandler dataHandler) {
        String[] arrToCheck = inputText.split(" ");
        //String[] arrayOfWords = dataHandler.getArr();
        StringBuilder wrongWords = new StringBuilder();

        for (int i = 0; i < arrToCheck.length; i++) {
            int index = Arrays.binarySearch(dataHandler.getArr(), arrToCheck[i].toLowerCase());
            if (index < 0) {
                wrongWords.append(arrToCheck[i]).append(" ");
            }
        }
        return wrongWords.toString();
    }
}
