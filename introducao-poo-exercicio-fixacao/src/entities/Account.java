package entities;

public class Account {
    private final int accountNumber;
    private String accountHolder;
    private double initialDeposit;
    private double accountBalance = initialDeposit;

    public Account(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double deposit(double value) {
        return accountBalance += value;
    }

    public double withdraw(double value) {
        return accountBalance -= (value + 5.00);
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }

}




