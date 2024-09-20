package Methods;


public class MethodPractice {

//    int max(int x, int y) {
//        if (x > y)
//            return x;
//        else
//            return y;
//    }

//    x++ only increments x value & doesn't change the original a value.
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {

//        int a = 10, b = 15;
//        System.out.println(max(10,5));
//
//        MethodPractice mp = new MethodPractice();
//        System.out.println(mp.max(a, b));


        int a=10;
        inc(a);
        System.out.println(a);


    }
}
