package Loops;

import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        // 1+2+3+4+5=15
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //sum += i;
            sum = sum + i;
        }
        System.out.println("Sum of" + " " + n + " " + "Number is " + " " + sum);
    }
}
