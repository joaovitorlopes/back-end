package Exercises;

public class BankAccount {
    private int accountNum;
    protected double balance;
    public String owner;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double value) {
        return this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void checkBalance(){
        System.out.println(this.balance);
    }
}
