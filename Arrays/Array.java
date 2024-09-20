package Arrays;

public class Array {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};

        int B[] = new int[3];  //C-style array type declaration

        int[] C = new int[5];  //Java-style array declaration
//      int []C = new int[5];

        int D[];
        D = new int[10];

        B[0]=20;
        B[1]=22;
        B[2]=15;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        System.out.println("");

        for (int i = A.length - 1; i >= 0; i--) {
            System.out.println(A[i]);
        }

        System.out.println("");

        for (int x : A) {
            System.out.println(x);
        }

    }
}
