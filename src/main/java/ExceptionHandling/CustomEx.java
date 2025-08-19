package src.main.java.ExceptionHandling;

public class CustomEx {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        try {
            acc.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
class BankAccount {
    private int balance = 1000;
    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining: " + balance);
        }
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}