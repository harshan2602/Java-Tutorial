package Methods;

public class VarArgs {

    static void show(int... A) {
        for (int x : A) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show();
        show(10, 20, 30);
        show(new int[]{2, 4, 6, 8, 10, 12}); //time being a array is created and destroyed for this method
        //Anonymous array
    }
}
