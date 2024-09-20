package OOPS.inheritance;

class Super1 {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super1 {
    public void display() {
        System.out.println("Sub Display");
    }
}

public class Override {
    public static void main(String[] args) {
        Super1 s = new Sub();
        s.display();
//        Sub s = new Sub();
//        s.display();
    }
}
