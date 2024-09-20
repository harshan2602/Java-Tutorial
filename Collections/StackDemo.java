package Collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        /*  stack -LIFO data-structure Last-In First-Out
            stores objects into sort of vertical tower.
            push() - add to top
            pop() - remove from the top
         */


        Stack<String> stack = new Stack();

        System.out.println(stack.empty());

        stack.push("GTA V");
        stack.push("Ghost Of Tsushima");
        stack.push("FFXV");
        stack.push("RDR2");
        stack.push("Horizon Zero Dawn");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println();
    }
}
