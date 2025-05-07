package test;

public class Account {
	private String accNo;
	private int balance;

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(getAccNo() + " 계좌가 개설되었습니다.");
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int balance) {
		this.balance += balance;
		System.out.println(getAccNo() + " 계좌에 " + getBalance() + "만원이 입금되었습니다.");
	}

	public void deposit(int balance) {
		this.balance -= balance;
		System.out.println(getAccNo() + " 계좌에 " + balance + "만원이 출금되었습니다.");
	}

}
