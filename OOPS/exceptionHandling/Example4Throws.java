package OOPS.exceptionHandling;

class NegativeDimensionException extends Exception {
    public String toString() {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class Example4Throws {
    static int area(int l,int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area is "+area(-5,5));
    }
    public static void main(String[] args) {
        try
        {
            meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.err.println(e);
        }
        System.err.println("hi");
    }
}
