package lab5;

import lab5.transaction.Account;
import lab5.reports.TransactionReport;

public class BankApp {
    public static void main(String[] args) {
        Account acc = new Account("ACC-908172", 10000.00);
        TransactionReport report = new TransactionReport();

        report.generateReport(acc);

        acc.deposit(3500.50);
        acc.withdraw(2000.00);
        acc.withdraw(15000.00);

        report.generateReport(acc);
    }
}
