package Loops;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        System.out.println("Reverse number : " + rev);
    }
}
