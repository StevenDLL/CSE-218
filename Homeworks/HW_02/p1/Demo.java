package Homeworks.HW_02.p1;

public class Demo {
    public static void main(String[] args) {

        //StackDemo();
        System.out.println("---");
        //QueueDemo();
        System.out.println("---");
        PriorityQueue(); //GOTTA FINISH THIS ONE

    }

    private static void StackDemo() {
        MyStack stack = new MyStack(5);

        int number = 10; //STARTING NUMBER
        while (number < 90) { //MAX NUMBER
            stack.push(number);
            number += 10;
        }
        System.out.println("Peeked top at:" + stack.peek());
        while (stack.isEmpty()) {
            System.out.println("Popped out:" + stack.pop());
        }
    }

    private static void QueueDemo() {
        MyQueue queue = new MyQueue(10);
        int number = 5;
        while (number < 50) {
            queue.insert(number);
            number += 5;
        }

        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        System.out.println(queue.peek());

    }

    private static void PriorityQueue() {
        MyPriorityQueue priorityQueue = new MyPriorityQueue(10);
        int number = 5;
        while (number < 55) {
            priorityQueue.insert(number);
            number += 5;
        }

        System.out.println(priorityQueue.peekAtMinimum());
        System.out.println(priorityQueue.peekAtMinimum());
        priorityQueue.printValues();
        priorityQueue.insert(0);
        System.out.println(priorityQueue.peekAtMinimum());
    }

}
