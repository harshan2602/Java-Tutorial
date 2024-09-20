package OOPS.introduction;

class Rectangles{
    private int length;
    private int breadth;

    public Rectangles(){
        length=10;
        breadth=10;
    }

    public Rectangles(int l,int b){
        setLength(l);
        setBreadth(b);
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setLength(int l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
//        length = l;
    }

    public int setBreadth(int b)
    {
        if(b>=0)
            breadth= b;
        else
            breadth=0;
        return b;
    }

    public int area()
    {
        //return length*breadth;
        return getLength()*getBreadth();
    }

    public int perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        return length == breadth;
//        if(length==breadth)
//            return true;
//        else
//            return false;
    }
}



public class RectangleTest1 {
    public static void main(String[] args) {
//        Rectangles r = new Rectangles(55,58);
        Rectangles r = new Rectangles();

        r.setLength(10);//check with negative values.
        r.setBreadth(5);
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());

        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());

    }
}
