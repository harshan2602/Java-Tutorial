package Introduction;

import java.util.Scanner;

public class Scannner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter your name : ");
        a = sc.nextLine();
        System.out.println("Hello " + a);
        sc.close();
    }

}


