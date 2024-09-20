package OOPS.exceptionHandling;

public class Example2CustomException {
    public static void main(String[] args) {
        double bal = 500, withdraw = 700;
        try {
            if (bal < withdraw) {
                throw new InsufficientFundException(withdraw - bal);
            }
        } catch (InsufficientFundException e) {
            System.out.println("Not enough Money");
        }
    }
}
