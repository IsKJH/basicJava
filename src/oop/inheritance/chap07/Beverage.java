package oop.inheritance.chap07;

public class Beverage {
	public String type;
	public int price;

	public Beverage() {
		super();
	}

	public Beverage(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
