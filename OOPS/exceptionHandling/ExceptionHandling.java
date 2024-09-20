package OOPS.exceptionHandling;
/*
Exception Handling
Checked Exception, Unchecked Exception, Try with Resources
throw, throws.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int c = 0;
        try {
            int arr[] = null;
            System.out.println(arr[1]);
            c = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException has occured");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException has occured");
        }
//        catch (ArithmeticException | NullPointerException e) {
//            System.out.println("NullPointerException has occured");  //java 1.7
//        }
        catch (Exception e) {
            System.out.println("Error Occured");
        }
        finally {
            System.out.println("This gets printed no matter what");
        }
        System.out.println(c);
        System.out.println("End Of Program");

    }
}
