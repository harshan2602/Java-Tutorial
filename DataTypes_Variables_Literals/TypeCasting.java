package DataTypes_Variables_Literals;

public class TypeCasting {
    public static void main(String[] args) {

//      Widening casting is done automatically when passing a
//      smaller size type to a larger size type:

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


//      Narrowing Casting
//      Narrowing casting must be done manually by placing the type in parentheses ()
//      in front of the value:

        double x = 9.78d;
        int y = (int) x; // Manual casting: double to int

        System.out.println(x);   // Outputs 9.78
        System.out.println(y);      // Outputs 9
    }
}
