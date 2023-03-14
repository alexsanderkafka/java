package entities;

public class Bank {
	
	private String name;
	private int numAccount;
	private double value;
	
	public Bank(String name, int numAccount) {
		this.name = name;
		this.numAccount = numAccount;
	}
	
	public Bank(String name, int numAccount, double initialDeposit) {
		this.name = name;
		this.numAccount = numAccount;
		addValue(initialDeposit);
	}
	
	
	
	public String getName() {
		return name;
	}

	public int getNumAccount() {
		return numAccount;
	}

	public double getValue() {
		return value;
	}

	public double addValue(double value) {
		return this.value += value;
	}
	
	public double removeValue(double value) {
		return this.value -= value + 5;
	}
	
	public String nickName(String name) {
		return this.name = name;
	}
	
	public String toString() {
		return "Account " + numAccount
		   + " Holder: " + name
		   + ", Balance: $ " + String.format("%.2f", value);
	}
}
