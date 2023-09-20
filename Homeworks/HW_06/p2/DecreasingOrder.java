package Homeworks.HW_06.p2;

import java.util.LinkedList;
import java.util.Random;

public class DecreasingOrder {
    public LinkedList<Double> listOfNumbers = new LinkedList<>();

    public void displayList() {
        for (int i = 0; i < this.listOfNumbers.size(); i++) {
            System.out.println(this.listOfNumbers.get(i));
        }
    }

    public void fill() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            this.listOfNumbers.add(random.nextDouble());
        }
    }
}
