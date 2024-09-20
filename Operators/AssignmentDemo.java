package Operators;

public class AssignmentDemo {
    public static void main(String[] args) {
        int x = 2;
        double y = 2;
        //x += 3;
        System.out.println(x += 2);
        System.out.println(x -= 2);
        System.out.println(x *= 2);
        System.out.println(y /= 2);
        System.out.println(x %= 2);
        System.out.println(x &= 2);
        System.out.println(x |= 2);
        System.out.println(x ^= 2);
        System.out.println(x <<= 2);
        System.out.println(x >>= 2);

    }
}
