package Collection;


import java.util.*;

public class queueDemo {
    public static void main(String args[]) {
        Queue<Integer> myQue = new LinkedList<Integer>();

        myQue.add(10);
        myQue.add(20);
        myQue.add(30);
        myQue.add(40);
        myQue.add(50);

        System.out.println("The queue size: " + myQue.size());
        System.out.println("The element in the queue: " + myQue);
        System.out.println("The top element in the queue: " + myQue.peek());

        while (!myQue.isEmpty()) {
            System.out.println("Popped Item: " + myQue.remove());
        }


    }
}