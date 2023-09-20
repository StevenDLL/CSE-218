package Homeworks.HW_03.p4;

public class Demo {
    public static void main(String[] args) {
        NumberBag<Integer> integerNumberBag = new NumberBag<>(10);
        for (int i = 0; i < 10; i++) {
            integerNumberBag.insert(i);
        }
        System.out.println("Find: " + integerNumberBag.find(3));
        System.out.println("Removed:" + integerNumberBag.remove(3));
        System.out.println("Find: " + integerNumberBag.find(3));
        integerNumberBag.display();
    }
}
