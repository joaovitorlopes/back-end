package Exercises;

public class BankAccount {
    private int accountNum;
    private double balance;
    public String owner;

    public int getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
