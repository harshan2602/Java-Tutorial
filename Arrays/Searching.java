package Arrays;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Key ");
        int key = sc.nextInt();


        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("Element Found at :" + i);
                System.exit(0);
            }
        }
//        for (int x : A){
//            if (key == x){
//                System.out.println("True");
//                System.exit(0);
//            }
//        }
        System.out.println("Not found");
    }
}
