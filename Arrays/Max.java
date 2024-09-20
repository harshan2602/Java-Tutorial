package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] A = {10, 20,60, 30, 40, 50};
        int max = A[0];
        for (int x : A) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
