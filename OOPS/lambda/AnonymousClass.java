package OOPS.lambda;

class Cycle{
    void display() {
        System.out.println("I am a cycle");
    }

}

public class AnonymousClass {
    public static void main(String[] args) {
        Cycle c = new Cycle()   // anonymous class
        {
            void display() {
                System.out.println("I am a tricycle");
            }
        };

        Cycle c2 = new Cycle();

        c.display();
        c2.display();
    }
}
