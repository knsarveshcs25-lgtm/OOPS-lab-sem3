package lab5.reports;

import lab5.transaction.Account;

public class TransactionReport {
    public void generateReport(Account account) {
        System.out.println("\n=========================================");
        System.out.println("         ACCOUNT STATEMENT REPORT        ");
        System.out.println("Account Number  : " + account.getAccountNumber());
        System.out.printf("Current Balance : Rs. %.2f%n", account.getBalance());
    }
}
