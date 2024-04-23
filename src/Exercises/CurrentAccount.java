package Exercises;

public class CurrentAccount extends BankAccount{
    public void chargeMonthlyRate() {
        this.balance -= 10;
        System.out.println("Your monthly fee has been charged");
    }
}
