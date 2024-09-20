package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int m =n;
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        if (rev==m){
            System.out.println("Its a Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
