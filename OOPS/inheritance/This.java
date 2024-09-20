package OOPS.inheritance;

class Rectangle2 {
    int length;
    int breadth;

    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}

public class This {
    public static void main(String[] args) {
        Rectangle2 r2 = new Rectangle2(10,20);
        r2.display();
    }
}
