package Collections;
/*
 * set - only unique elements
 * HashSet - hashing
 * Redundancy not allowed in HashSet.
 *
 */
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<String> h = new TreeSet<String>();
//        LinkedHashSet<String> lh = new LinkedHashSet<String>();
//        Set<String> h = new LinkedHashSet<>();

        h.add("Ram");
        h.add("Abi");
        h.add("Priya");
        h.add("Ravi");
        h.add("Abi");

        System.out.println(h);
    }
}
