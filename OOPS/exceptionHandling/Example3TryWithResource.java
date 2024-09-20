package OOPS.exceptionHandling;

import java.util.Scanner;

public class Example3TryWithResource {
    public static void main(String[] args) {
        //try with resource
        int i;
        try(Scanner sc =new Scanner(System.in)){
            i=sc.nextInt();
            System.out.println(i);
        }
//usually we use sc.close() to close the scanner, good practice
// we can include the Scanner statement inside the parenthesis of try block also
    }
}
