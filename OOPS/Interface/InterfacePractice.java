package OOPS.Interface;

interface Test1{
    void meth1();
    void meth2();
}
class Test2 implements Test1{

    @Override
    public void meth1() {
        System.out.println("meth1 of Test2");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of Test2");
    }

//    public void meth3() {
//        System.out.println("meth3 of Test2");
//    }

}

public class InterfacePractice {
    public static void main(String[] args) {
//        Test1 t;
//        Test1 t = new Test1();
        Test1 t = new Test2();
        t.meth1();
        t.meth2();
//        t.meth3();
    }
}