package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount client;
		double deposit;

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String response = sc.nextLine();

		if (response.equalsIgnoreCase("n")) {
			client = new BankAccount(numberAccount, name);
		}
		else {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			client = new BankAccount(numberAccount, name, deposit);
		}

		System.out.println("Account data:");
		System.out.print(client);
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		client.bankDeposit(deposit);
		System.out.println("Update account data: ");
		System.out.printf("Account %d, holder: %s, Balance: $ %.2f%n", client.getNumberAccount(), client.getName(), client.getMoneyInAccount());
		System.out.print("Enter a withdraw value: ");
		double Withdrawal = sc.nextDouble();
		client.bankWithdrawal(Withdrawal);
		System.out.println("Update account data: ");
		System.out.printf("Account %d, holder: %s, Balance: $ %.2f%n", client.getNumberAccount(), client.getName(), client.getMoneyInAccount());
	}
}