package Homeworks.HW_04.Custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class DataHandler {

    private LinkedList<Link> parentLinks;
    private String[] stringArray;
    private String mainString;

    public DataHandler() {
        parentLinks = new LinkedList<>();
        mainString = getMainString("./src/Homeworks.HW_04/Data/blowingInTheWind.txt");
        stringArray = getDataAsArray(mainString);
    }

    //O(N^2)
    public void generateList() {
        parentLinks.add(new Link(stringArray[0]));
        Link previous = parentLinks.get(0);
        Link current = null;
        //O(N)
        for (int i = 1; i < stringArray.length; i++) {
            //O(N)
            int spot = find(parentLinks, stringArray[i]);
            if (spot == -1) {
                current = new Link(stringArray[i]);
                //O(1)
                parentLinks.add(current);
            } else {
                current = parentLinks.get(spot);
            }
            //O(1)
            previous.addToBabyList(current);
            previous = current;
        }
    }

    //O(N)
    public String generateCustomSentenceFromList(String keyword, int length) {
        StringBuilder str = new StringBuilder(keyword + " ");
        Random random = new Random();

        String word = keyword;
        //O(1)
        for (int i = 0; i < length; i++) {
            //O(N)
            int loc = find(this.parentLinks, word);
            if (loc != -1) {
                LinkedList<Link> tempList = this.parentLinks.get(loc).getBabyList();
                word = tempList.get(random.nextInt(tempList.size())).getData();
                str.append(word).append(" ");
            }

        }
        return str.toString();
    }

    // O(N)
    private String[] getDataAsArray(String mainString) {
        return mainString.toLowerCase().split(" ");
    }

    private String getMainString(String path) {
        StringBuilder str = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                str.append(scanner.nextLine()).append("\s");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return str.toString().replaceAll("[^a-zA-Z']", " ").toLowerCase();
    }

    //O(N)
    public static int find(LinkedList<Link> linkedList, String key) {
        //O(1)
        for (int i = 0; i < linkedList.size(); i++) {
            //O(N)
            if (linkedList.get(i).getData().equals(key)) {
                return i; //return location of where it was found
            }
        }
        return -1;
    }

}
