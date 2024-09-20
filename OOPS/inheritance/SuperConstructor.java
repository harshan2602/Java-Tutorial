package OOPS.inheritance;

class Rectangle1 {
    int length;
    int breadth;

    Rectangle1() {
        length = breadth = 1;
    }

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid1 extends Rectangle1 {
    int height;

    Cuboid1() {
        height = 1;
    }

    Cuboid1(int h) {
        height = h;
    }

    Cuboid1(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }

}

public class SuperConstructor {
    public static void main(String[] args) {
        Cuboid1 cb = new Cuboid1(5, 5, 5);
        System.out.println(cb.volume());
    }
}
