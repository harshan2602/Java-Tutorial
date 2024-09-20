package Operators;

import java.util.Scanner;

public class RelationalDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scan.nextInt();
        System.out.println("Enter second number: ");
        int y = scan.nextInt();

        System.out.println("x > y is " + (x > y));
        System.out.println("x < y is " + (x < y));
        System.out.println("x >= y is " + (x >= y));
        System.out.println("x <= y is " + (x <= y));
        System.out.println("x == y is " + (x == y));
        System.out.println("x != y is " + (x != y));

    }
}
