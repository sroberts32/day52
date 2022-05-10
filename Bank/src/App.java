package day52.Bank.src;

public class App {
    public static void main(String[] args) throws Exception {
        //part 1 answer
        BankAccount account = new BankAccount("Shane", 500);
        account.deposit(100);
        account.withdrawl(0);
        account.printAccountDetails();

        //part 2 answer
        BankAccount account1 = new BankAccount("Larry", 5000);
        BankAccount account2 = new BankAccount("Mary", 300);
        account2.deposit(100);
        account1.withdrawl(100);
        account1.printAccountDetails();
        account2.printAccountDetails();
    
    }
}
