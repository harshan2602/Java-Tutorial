package OOPS.introduction;

class Square {

    private int length;
    private int breadth;

    // Non-parameterized Constructor
    public Square() {
        length = 10;
        breadth = 10;
    }

    // Parameterized Constructor
    public Square(int l, int b) {
        length = l;
        breadth = b;
    }

//    public Square(int s) {
//        length = breadth = s;
//    }


    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}


public class ConstructorSquare1 {
    public static void main(String[] args) {
        Square s = new Square(5,5);
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
