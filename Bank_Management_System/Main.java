package Bank_Management_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankService bankService = new BankService();

		int choice;

		do {

			System.out.println("\n=====================================");
			System.out.println("     BANK MANAGEMENT SYSTEM");
			System.out.println("=====================================");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. Search Account");
			System.out.println("6. Display All Accounts");
			System.out.println("7. Delete Account");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter Account Number: ");
				int accountNumber = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Customer Name: ");
				String customerName = sc.nextLine();

				System.out.print("Enter Mobile Number: ");
				String mobileNumber = sc.nextLine();

				System.out.print("Enter Account Type (Savings/Current): ");
				String accountType = sc.nextLine();

				System.out.print("Enter Initial Balance: ");
				double balance = sc.nextDouble();

				BankAccount account = new BankAccount(accountNumber, customerName, mobileNumber, accountType,
						balance);

				bankService.createAccount(account);

				break;

			case 2:

				System.out.print("Enter Account Number: ");
				accountNumber = sc.nextInt();

				System.out.print("Enter Deposit Amount: ");
				double deposit = sc.nextDouble();

				bankService.depositMoney(accountNumber, deposit);

				break;

			case 3:

				System.out.print("Enter Account Number: ");
				accountNumber = sc.nextInt();

				System.out.print("Enter Withdrawal Amount: ");
				double withdraw = sc.nextDouble();

				bankService.withdrawMoney(accountNumber, withdraw);

				break;

			case 4:

				System.out.print("Enter Account Number: ");
				accountNumber = sc.nextInt();

				bankService.checkBalance(accountNumber);

				break;

			case 5:

				System.out.print("Enter Account Number: ");
				accountNumber = sc.nextInt();

				BankAccount found = bankService.searchAccount(accountNumber);

				if (found != null) {
					found.displayAccount();
				} else {
					System.out.println("Account not found.");
				}

				break;

			case 6:

				bankService.displayAllAccounts();

				break;

			case 7:

				System.out.print("Enter Account Number: ");
				accountNumber = sc.nextInt();

				bankService.deleteAccount(accountNumber);

				break;

			case 8:

				System.out.println("Thank you for using Bank Management System.");

				break;

			default:

				System.out.println("Invalid Choice! Please try again.");

			}

		} while (choice != 8);

		sc.close();
	}
}