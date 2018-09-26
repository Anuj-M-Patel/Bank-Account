
public class BankAccount {

	//Fields
	private String name;
	private int accNum;
	private double balance;
	
	//Constructors
	public BankAccount(String name, int accNum) {
		this.name = name;
		this.accNum = accNum;
		balance = 0;
	}
	
	public BankAccount(String name, int accNum, double balance) {
		this.name = name;
		this.accNum = accNum;
		this.balance = balance;
	}
	
	//Methods
	public void deposit(double amntDeposited) {
		balance += amntDeposited;
	}
	
	public void withdraw(double amntWithdrawn) {
		balance -= amntWithdrawn;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Name: " + name + "\nAccount Number: " + accNum + "\nBalance: " + balance;
	}
}
