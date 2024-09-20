package OOPS.introduction;

class Rectangle {
    public int length;
    public int breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 10;

        System.out.println("Area is : " + r1.area());
        System.out.println("Perimeter is : " + r1.perimeter());
        System.out.println(r1.isSquare());
    }
}


