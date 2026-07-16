package Bank_Management_System;
public class BankAccount {

    // Data Members
    private int accountNumber;
    private String customerName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String customerName,
                       String mobileNumber, String accountType,
                       double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Display Account Details
    public void displayAccount() {

        System.out.println("\n==============================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("==============================");
    }
}