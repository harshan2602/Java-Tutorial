package Operators;

public class BitwiseDemo {
    public static void main(String[] args) {
        //AND
        int x = 10, y = 6;
        System.out.println("AND : " + (x & y));

        //OR
        System.out.println("OR : " + (x | y));

        //XOR
        System.out.println("XOR : " + (x ^ y));

        //LEFT SHIFT
        System.out.println("LEFT SHIFT :" + (x << 1));

        //RIGHT SHIFT
        System.out.println("RIGHT SHIFT :" + (x >> 1));

        //UNSIGNED RIGHT SHIFT
        System.out.println("UNSIGNED RIGHT SHIFT :" + (x >>> 1));

        //NOT
        System.out.println("NOT :" + (~x));
    }
}
