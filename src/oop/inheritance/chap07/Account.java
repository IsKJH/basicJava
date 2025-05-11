package oop.inheritance.chap07;

public class Account {
	private String accId;
	private int balance;
	private String onewrName;

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}

	public Account() {
		System.out.println(balance);
	}

	public Account(String accId, String onewrName, int balance) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.onewrName = onewrName;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOnewrName() {
		return onewrName;
	}

	public void setOnewrName(String onewrName) {
		this.onewrName = onewrName;
	}

}
