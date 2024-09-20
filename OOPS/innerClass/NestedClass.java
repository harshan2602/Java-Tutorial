package OOPS.innerClass;

class Outer {
    int num;

    void outerDisplay() {
        System.out.println("Outer Display");
    }

    static class Inner {
        int x;

        void innerDisplay() {
            System.out.println("Inner Display");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.num = 5;
        o.outerDisplay();
//        Outer.Inner i = o.new Inner();
//        i.innerDisplay();

 Outer.Inner i = new Outer.Inner();  //if inner class is static no object is needed.
i.innerDisplay();
    }
}
