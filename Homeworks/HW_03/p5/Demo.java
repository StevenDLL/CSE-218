package Homeworks.HW_03.p5;

public class Demo {
    public static void main(String[] args) {
        GBag<Object> bag = new GBag(10);
        bag.insert("test");
        bag.insert(1);
        bag.insert(1234);
        bag.insert("test 2 much");
        bag.insert("beep");
        bag.display();
        System.out.println("Removed: " + bag.remove("test"));
        System.out.println("Removed: " + bag.remove(1));
        System.out.println();


        System.out.println("Find:" + bag.find(1234));
        System.out.println();
    }
}
