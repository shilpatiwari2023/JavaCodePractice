package src.main.java.ExceptionHandling;

public class Exception15_CustomExceptionExample {
    public static void main(String[] args) {
        Exception14_BankExample sbi = new Exception14_BankExample("INR",100);
        Exception14_BankExample icici = new Exception14_BankExample("INR",200);
        Exception14_BankExample jpm = new Exception14_BankExample("USD",300);
        int total = sbi.add(icici);
        int total1 = sbi.add(jpm);
        System.out.println(total);
        System.out.println(total1);

    }
}
