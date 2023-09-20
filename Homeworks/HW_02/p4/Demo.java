package Homeworks.HW_02.p4;

public class Demo {
    public static void main(String[] args) {
        PQueue q = new PQueue(5);
        q.insert(30);
        q.insert(50);
        q.insert(10);
        q.insert(40);
        q.insert(20);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

    }
}
