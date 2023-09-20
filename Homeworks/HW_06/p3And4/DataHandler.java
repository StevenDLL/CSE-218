package Homeworks.HW_06.p3And4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class DataHandler {

    private String[] arr;


    public DataHandler() {
        this.arr = loadDictionary();
        sortArray(this.arr);
    }

    public String[] getArr() {
        return this.arr;
    }

    private String[] loadDictionary() {
        LinkedList<String> tempList = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(new File("./src/Homeworks/HW_06/p3And4/Data/dictionary.txt"));
            while (scanner.hasNextLine()) {
                tempList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        return tempList.toArray(new String[0]);
    }

    private void sortArray(String[] arrToSort) {
        for (int i = 1; i < arrToSort.length; i++) {
            String insertValue = arrToSort[i];
            int j;
            for (j = i - 1; j >= 0 && insertValue.compareTo(arrToSort[j]) < 0; j--) {
                arrToSort[j + 1] = arrToSort[j];
            }
            if (j != i - 1) {
                arrToSort[j + 1] = insertValue;
            }
        }
    }

    public void saveData(String text, File fileToSave) {

        try {
            FileWriter fileWriter = new FileWriter(fileToSave, false);
            fileWriter.write(text);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
