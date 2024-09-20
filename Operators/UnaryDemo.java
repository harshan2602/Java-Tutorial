package Operators;

public class UnaryDemo {
    public static void main(String[] args) {
        //increment operator
        int x = 5;
        int y = x++; //post ++ here x will be assigned to y and then incremented to 6,
//        // so y value is 5 since x hasn't incremented yet.
        System.out.println(x);

        int z = ++x; //pre -- here first x value is incremented to 6 and then assigned to z,
////                       so z value becomes 6
        int a = x++;
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(x);

//        int x = 5, y = 4, z;
//        z = 2 * x++ + 3 * ++y;
//        System.out.println(z);
//
//        int a = 10;
//        int b = 10;
//        System.out.println(a++ + ++a);
//        System.out.println(b++ + b++);

    }
}
