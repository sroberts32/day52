package day52.Bank.src;

public class BankAccount {
    private String name;
    private double balance; 
    private int accountNum;


    //constructor 1 - 3 parameters
    public BankAccount(String name, double balance, int accountNum) {
        this.name = name;
        this.balance = balance;
        this.accountNum = accountNum;
    }

    //constructor 2 - no parameters
    public BankAccount(){}

    public BankAccount(String name){
        this.name = name;
    }

    public BankAccount(String name, int accountNum) {
        this.name = name;
        this.accountNum = accountNum;
    }

    //deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    //withdrawl method
    public void withdrawl(double amount) {
        balance -= amount;
    }

    //print - not the toString method
    public void printAccountDetails() {
        System.out.println(this.name + "'s account balance: " + this.balance);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return this.accountNum;
    }

    public void transfer(BankAccount acc, double amount) {
        withdrawl(amount);
        acc.deposit(amount);
    }

}
