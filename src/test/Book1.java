package test;

public class Book1 {
	private String title;
	private int price;
	private int count;

	public int getTotalPrice() {
		return price * count;
	}

	public void printInfo() {
		System.out.println("도서: " + title + "\t\t단가: " + price + "\t수량: " + count + "\t금액: " + getTotalPrice());
	}

	public Book1() {
		super();
	}

	public Book1(String title, int price, int count) {
		super();
		this.title = title;
		this.price = price;
		this.count = count;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
