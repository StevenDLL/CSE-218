package Homeworks.HW_01.p1;

public class Demo {
    public static void main(String[] args) {

        //A
        //Create and fill all 20 bags
        System.out.println("Part A");
        Bag[] bags = new Bag[20];
        for (int i = 50; i <= 1000; i += 50) {
            bags[(i / 50) - 1] = new Bag();
            bags[(i / 50) - 1].fillArrayInBag(i);
        }
        System.out.println();

        //B
        //Do sequential search
        System.out.println("Part B");
        for (int i = 0; i < bags.length; i++) {
            long start = 0;
            long total = 0;
            long end = 0;
            int[] tempValues = bags[i].getNumbersInArray();
            for (int k = 0; k < tempValues.length; k++) {
                start = System.nanoTime();
                if (bags[i].doSequentialSearch(tempValues[k]) != -1) {
                    end = System.nanoTime();
                    total += (end - start);
                    break;
                }
            }
            System.out.println("Array #" + i + "\t" + "Average Time: " + (total / 20));
        }

        System.out.println();

        //C
        //Do binary search
        System.out.println("Part C");
        Bag[] newBags = bags.clone();
        for (int i = 0; i < newBags.length; i++) {
            //Sort array for binary search
            newBags[i].doBasicSorting();
            long start;
            long total = 0;
            long end;

            int[] tempValues = newBags[i].getNumbersInArray();
            for (int k = 0; k < tempValues.length; k++) {
                start = System.nanoTime();
                if (newBags[i].doBinarySearch(tempValues[k]) != -1) {
                    end = System.nanoTime();
                    total += (end - start);
                    break;
                }
            }
            System.out.println("Array #" + i + "\t" + "Average Time: " + (total / 20));
        }


    }
}
