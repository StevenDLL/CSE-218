package Homeworks.HW_06.p2;

import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        DecreasingOrder decreasingOrder = new DecreasingOrder();
        decreasingOrder.fill();

        Collections.sort(decreasingOrder.listOfNumbers);
        Collections.reverse(decreasingOrder.listOfNumbers);

        decreasingOrder.displayList();
    }
}
