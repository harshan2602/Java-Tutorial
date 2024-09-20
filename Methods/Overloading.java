package Methods;

class Test
{
    public int max(int a,int b)
    {
//        return a>b?a:b;
        return Math.max(a, b);
    }

    public double max(double x,double y)
    {
        return Math.max(x, y);

    }

    public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

public class Overloading
{
    public static void main(String[] args)
    {
        Test t=new Test();
        System.out.println(t.max(10,5));
        System.out.println(t.max(10.8,5.5));
        System.out.println(t.max(10,15,5));



    }

}
