package oop.inheritance.chap07;

public class CheckingAccount extends Account {
	private String cardNo;

	public void pay(int amount, String cardNo) {
		if (this.cardNo.equals(cardNo) && amount <= super.getBalance()) {
			withdraw(amount);
		} else {
			System.out.println("지불이 불가능합니다.");
		}
	}

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accId, String onewrName, int balance, String cardNo) {
		super(accId, onewrName, balance);
		this.cardNo = cardNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
