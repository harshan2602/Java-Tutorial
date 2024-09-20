package Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x : A) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
