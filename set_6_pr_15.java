
class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;
    BankAccount() {
        balance = 1000.00;
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}
public class BankingApp {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.deposit(1000.00);

        try {
            acc.withdraw(400.00);
            acc.withdraw(300.00);
            acc.withdraw(500.00); // This will throw exception
        } catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}
/* 
Deposited: 1000.0
Balance: 2000.0
Withdrawn: 400.0
Balance: 1600.0
Withdrawn: 300.0
Balance: 1300.0
Exception: Not Sufficient Fund
Transaction Completed 
*/
