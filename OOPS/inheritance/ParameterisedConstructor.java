package OOPS.inheritance;

class Parent1 {
    Parent1() {
        System.out.println("Non-Param of parent");
    }

    Parent1(int x) {
        System.out.println("Param of parent " + x);
    }
}

class Child1 extends Parent1 {
    public Child1() {
        System.out.println("Non-Param of child");

    }

    public Child1(int y) {

        System.out.println("Param of child");
    }

    public Child1(int x, int y) {
        super(x);
        System.out.println("2 param of child "+ y);
    }
}


public class ParameterisedConstructor {
    public static void main(String[] args) {
        //Child1 c=new Child1();
        //Child1 c=new Child1(20);
        Child1 c1 = new Child1(10, 20);
    }
}
