package src.main.java.ExceptionHandling;

public class Exception14_BankExample {
    private String currency;
    private int amount;

    public Exception14_BankExample(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer add(Exception14_BankExample bankname) {
        if (bankname.currency == "INR") {
            return bankname.amount + this.amount;
        } else {
            try {
                throw new CurrencyMismatchCustomException("Currency mismatch!");
            } catch (CurrencyMismatchCustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return amount;
    }
    class CurrencyMismatchCustomException extends Exception{
        CurrencyMismatchCustomException(String msg){
            super(msg);
        }
    }
    class NotValidAgeException extends Exception{
        NotValidAgeException(String msg){
            super(msg);
        }
    }
}
