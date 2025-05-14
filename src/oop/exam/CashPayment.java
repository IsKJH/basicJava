package oop.exam;

public class CashPayment extends Payment {
	private String cashReceiptNumber;

	@Override
	public void pay() throws PayException {
		if (productPrice <= 0) {
			throw new PayException("가격이 잘못되었습니다.");
		} else {
			System.out.println("현금이 정상적으로 지불되었습니다.");
			System.out.println("[ 현금 결제 정보 ]");
		}
	}

	@Override
	public String toString() {
		return "상점명 : " + shopName + "\n상품명 : " + productName + "\n상품가격 : " + productPrice + "\n현금영수증번호 : "
				+ cashReceiptNumber;
	}

	public CashPayment() {
		super();
	}

	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}

	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}

	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}

}
