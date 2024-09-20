package Collections;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        int a[] = new int[5]; //fixed size
//if you dont know the size and want to be flexible then use ArrayList instead of array.
        ArrayList<Integer> alist = new ArrayList<Integer>(); //flexible, supports redundancy/duplicates.

        for(int i=1;i<=10;i++)
            alist.add(i);

        alist.add(100);
        alist.add(100);
        alist.add(100);

//        System.out.println(alist[3]); //not possible like Array here.
        System.out.println(alist);
        System.out.println(alist.get(3));  //built on Array class, so some of those methods also available here.

        alist.set(0,100); //update  ,change 0th index to 100 number


        alist.remove(5);
        System.out.println(alist);

        System.out.println("");
//        for(int x:alist)
//            System.out.println(x);

        Iterator<Integer> i = alist.iterator();
        System.out.println("Using iterator");
//        System.out.println(i.next());  //just prints the next element.

        while(i.hasNext()) {        //hasNext() method will be true till the last element of array
            System.out.println(i.next());
        }
        ArrayList slist = new ArrayList(); //No type given, so any type can be added String,int...
//ArrayList<Employee> slist = new ArrayList(); object also can be given from a class.
        slist.add("John");
        slist.add(10);
        slist.add('t');
        System.out.println(slist);

        LinkedList<String> ll = new LinkedList<String>();

    }
}
