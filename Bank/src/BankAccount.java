package day52.Bank.src;

public class BankAccount {
    private String name;
    private double balance; 

    public BankAccount(String customerName, double accountBalance) {
        this.name = customerName;
        this.balance = accountBalance;
    }

    public void deposit(double increase) {
        balance += increase;
    }

    public void withdrawl(double decrease) {
        balance -= decrease;
    }

    public void printAccountDetails() {
        System.out.println(this.name + "'s account balance: " + this.balance);
    }


}
