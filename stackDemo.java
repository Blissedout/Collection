package Collection;
import java.util.*;
public class stackDemo {
    public static void main(String[] args) {
     Stack<Integer> myStack = new Stack<>();

    //push item into stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("The stack size: " + myStack.size());
        System.out.println("The top element in the stack: " + myStack.peek());

        while (!myStack.isEmpty()){
            System.out.println("Popped Item: " + myStack.pop());
        }

    }
}