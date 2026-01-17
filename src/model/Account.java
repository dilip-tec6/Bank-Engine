package Java_Projects.JavaBankEngine.src.model;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private Customer owner;

    public Account(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    Customer getOwner() {
        return owner;
    }
    public abstract void deposit ( double amount);
    public abstract void withdraw ( double amount);
}