package Introduction;

public class Cmd {
    public static void main(String[] args) {
        if (args.length > 1) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Sum: " + (num1 + num2));
        } else {
            System.out.println("Please provide two numbers.");
        }
    }
}

