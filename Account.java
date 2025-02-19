// account class handles financial transactions like deposits, withdrawals, transfers.
public class Account {
    private String accountNumber;
    private double balance;


    // constructor to initialize account
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: R" + amount);
        } else {
            System.out.println("Cannot deposit negative amount");
        }
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew R " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    // method to transfer money
    public void transfer(Account recipient, double amount){
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            recipient.deposit(amount);
        };
    };
}