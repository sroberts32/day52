package day52.Bank.src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // //part 1 answer
        // BankAccount account = new BankAccount("Shane", 500);
        // account.deposit(100);
        // account.withdrawl(0);
        // account.printAccountDetails();

        // //part 2 answer
        // BankAccount account1 = new BankAccount("Larry", 5000, 0001);
        // BankAccount account2 = new BankAccount("Mary", 300, 0002);
        // account2.deposit(100);
        // account1.withdrawl(100);
        // account1.printAccountDetails();
        // account2.printAccountDetails();


        //part 3 answer
        Scanner scanner = new Scanner(System.in);
        
        accounts.add(new BankAccount("Larry", 5000, 0001));
        accounts.add(new BankAccount("Mary", 300, 0002));

        System.out.println("Are you an existing customer? Type \"-1\" to end program.");
        System.out.println("1 for yes. \n 2 for no. ");
        int response = Integer.valueOf(scanner.nextLine());

        while (response != -1) {
        if (response == 1) {
            System.out.println("What is the account number?");
            int accountNum = Integer.valueOf(scanner.nextLine());
            
            boolean hasAccount = false;
            int index = -1;

            for (int = 0; i < accounts.size(); i++) {
                BankAccount acc = accounts.get(i);
                if (accountNum == acc.getAccNum()) {
                    hasAccount = true;
                    index = i;
                }
            }

        if (hasAccount) {
            mainMenu(accounts.get(index));
        } else {
            System.out.println("Sorry, we couldn't find your account. Try again.");
        }

        } else if (response == 2) {
            BankAccount newAccount = new BankAccount();

            System.out.println("Let's make a new account!");
            System.out.println("What is the name for the account?");
            String responseName = scanner.nextLine();
            newAccount.setName(responseName);

            System.out.println("What is the starting account balance?");
            int responseAmount = Integer.valueOf(scanner.nextLine());
            newAccount.setBalance(responseAmount);

            accounts.add(newAccount);

            mainMenu(accounts.get(accounts.size() - 1));

        } else if (response == -1) {
            System.out.println("Goodbye");
            break;
        }
    }
    }

    public static void mainMenu(BankAccount acc) {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Hello " + acc.getName());

        System.out.println("Welcome to the main menu, what would you like to do today?");
        System.out.println(
                "1. Check account balance \n 2. Make a withdrawl \n 3. Make a deposit \n 4. To make a transfer to another account \n 0. To exit");

        int response = Integer.valueOf(scanner2.nextLine());

        while (response != 0) {
            if (response == 1) {
                acc.getBalance();

            } else if (response == 2) {
                double withdrawlAmount = Double.valueOf(scanner2.nextLine());
                acc.withdrawl(withdrawlAmount);
                System.out.println(withdrawlAmount + " has been taken out of the account.");

            } else if (response == 3) {
                double depositAmount = Double.valueOf(scanner2.nextLine());
                acc.deposit(depositAmount);
                System.out.println(depositAmount + " has been added to the account.");

            } else if (response == 4) {
                System.out.println("Please enter the account number to transfer to.");
                int accTransferTo = Integer.valueOf(scanner2.nextLine());

                BankAccount transferTo = new BankAccount();
                boolean hasAccount = false;
                int index = -1;

                for (int i = 0; i < accounts.size(); i++) {
                    BankAccount accs = accounts.get(i);
                    if (accTransferTo == accs.getAccNum()) {
                        transferTo = accs;
                        hasAccount = true;
                        index = i;
                    }
                }

                if (hasAccount) {
                    System.out.println("How much would you like to transfer?");
                    double transferAmount = Double.valueOf(scanner2.nextLine());

                    acc.transfer(transferTo, transferAmount);
                    System.out.println(transferAmount + " has ben transfered to " + acc.getBalance());
                    System.out.println(transferTo.getName() + " was given " + transferAmount + " and now has" + transferTo.getBalance());
                    break;
                } else {
                    System.out.println("Sorry, we couldn't find your account. Try again.");
                }
                break;
            } else if (response == 0) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}
