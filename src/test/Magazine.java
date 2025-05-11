package test;

public class Magazine extends Book1 {
	private String month;

	public void printInfo() {
		System.out.println("도서: " + getTitle() + "(" + month + ") \t단가: " + getPrice() + "\t수량: " + getCount()
				+ "\t금액: " + getTotalPrice());
	}

	public Magazine(String title, int price, int count, String month) {
		super(title, price, count);
		this.month = month;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

}
