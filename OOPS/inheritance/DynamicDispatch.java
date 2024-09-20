package OOPS.inheritance;

class Super2 {
    public void meth1() {
        System.out.println("Super2 Meth1");
    }

    public void meth2() {
        System.out.println("Super2 Meth2");
    }
}

class Sub2 extends Super2 {
    @java.lang.Override
    public void meth2() {
        System.out.println("Sub2 Meth2");
    }

    public void meth3() {
        System.out.println("Sub2 Meth3");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Super2 sp=new Super2();
        sp.meth1();
        sp.meth2();

        System.out.println(" ");

        Super2 sup=new Sub2();
        sup.meth1();
        sup.meth2();
    }
}
