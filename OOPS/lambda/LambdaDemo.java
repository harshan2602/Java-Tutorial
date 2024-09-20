package OOPS.lambda;
//java 8 - Functional Interface
interface Ridable { //Single Abstract Method Interface - SAM interface
    int MAX_SPEED = 90 ;  //FINAL,STATIC
    void ride(); //abstract method
    default void display() {
        System.out.println("hello from ridable interface");
    }
    /*default methods evlo venalum irukelam but abstract methods only
     one should be there to call it as SAM or Functional Interface.
     from java 1.8/ version 8 if a interface is functional interface then we can use lambda expression..
    */

}

public class LambdaDemo {
    public static void main(String[] args) {

        //Anonymous Class
        Ridable r2 = new Ridable() {
            public void ride() {
                System.out.println("You are riding a vintage car");
            }
        };

        r2.ride();


        //lambda expression - functional interface
        Ridable r3 = () -> System.out.println("You are riding a Convertible car");

        r3.ride();
    }
}
