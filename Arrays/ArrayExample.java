package Arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();

        // Create an array with the specified size
        int[] A = new int[size];

        // Get user input to fill the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }

        // Display the elements of the array
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.println(A[i]);
        }
    }
}
