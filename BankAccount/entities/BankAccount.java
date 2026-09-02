package entities;

public class BankAccount {

	private int _numberAccount;
	private String _name;
	private double _moneyInAccount;

	public BankAccount(int numberAccount, String name) {
		_numberAccount = numberAccount;
		_name = name;
	}

	public BankAccount(int numberAccount, String name, double initialDeposit) {
		_numberAccount = numberAccount;
		_name = name;
		bankDeposit(initialDeposit);
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getMoneyInAccount() {
		return _moneyInAccount;
	}

	public int getNumberAccount() {
		return _numberAccount;
	}

	public void bankDeposit(double amount) {
		_moneyInAccount += amount;
	}

	public void bankWithdrawal(double amount) {
		_moneyInAccount -= amount + 5.0;
	}

	public String toString() {
		return "Account " + String.format("%d", getNumberAccount()) + ", " +
		"holder: " + String.format("%s", getName()) +  ", " + "Balance: $ " + 
		String.format("%.2f%n", getMoneyInAccount());
	}
}
