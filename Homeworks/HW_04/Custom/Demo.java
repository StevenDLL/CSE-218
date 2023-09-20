package Homeworks.HW_04.Custom;

public class Demo {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        dataHandler.generateList();
        for (int i = 0; i < 5; i++) {
            System.out.println(dataHandler.generateCustomSentenceFromList("how", 7 + i));

        }
        System.out.println();
    }
}
