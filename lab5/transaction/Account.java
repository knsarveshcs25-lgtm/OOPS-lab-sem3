package lab5.transaction;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: Rs. %.2f | Updated Balance: Rs. %.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn: Rs. %.2f | Updated Balance: Rs. %.2f%n", amount, balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal of Rs. " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

