package Collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        /*
        PriorityQueue sorts and adds the element in increasing order but queue doesn't. In our example
        1 will be head and 10 will be tail.
         */
        /*
        Queue<Integer> qu = new LinkedList<>();

        //Queue is an interface, so no object creation, right side another collection
        if we remove 3 then head will point to 10.
        */
        q.add(3);
        q.add(10);
        q.add(1);
        q.add(8);

        System.out.println("Head is " + q.peek()); //returns only head element.

        System.out.println("Removed " + q.poll());

//        System.out.println("Removed " + q.remove());
/*
difference between remove and poll method is remove throws an exception if the queue is empty
but poll doesn't throw any error just returns null value.
 */

        System.out.println("Head is " + q.peek());

        System.out.println("Size is " + q.size());


    }
}
