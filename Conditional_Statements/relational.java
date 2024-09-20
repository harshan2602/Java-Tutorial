package Conditional_Statements;

public class relational {
    public static void main(String[] args) {
//        int x = 5;
//        if (x >= 0) {
//            System.out.println("given number is positive");
//        } else {
//            System.out.println("given number is negative");
//        }

        //nested if, find the largest number
        int a=5,b=10,c=15;
        if (a>b&&a>c){
            System.out.println(a);
        }
        else {
            if (b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }

        //elseif
        int x=5,y=20,z=4;

        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
}
