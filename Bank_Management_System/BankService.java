package Bank_Management_System;
import java.util.ArrayList;

public class BankService {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Create Account
    public void createAccount(BankAccount account) {
        if (searchAccount(account.getAccountNumber()) != null) {
            System.out.println("Account Number already exists!");
            return;
        }

        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    // Search Account
    public BankAccount searchAccount(int accountNumber) {

        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    // Deposit Money
    public void depositMoney(int accountNumber, double amount) {

        BankAccount account = searchAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw Money
    public void withdrawMoney(int accountNumber, double amount) {

        BankAccount account = searchAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Check Balance
    public void checkBalance(int accountNumber) {

        BankAccount account = searchAccount(accountNumber);

        if (account != null) {
            System.out.println("Current Balance: ₹" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display All Accounts
    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (BankAccount account : accounts) {
            account.displayAccount();
        }
    }

    // Delete Account
    public void deleteAccount(int accountNumber) {

        BankAccount account = searchAccount(accountNumber);

        if (account != null) {
            accounts.remove(account);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}