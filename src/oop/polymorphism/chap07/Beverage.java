package oop.polymorphism.chap07;

public abstract class Beverage {
	private String name;
	protected int price;

	public abstract void calcPrice();

	public void print() {
		System.out.println(" 번째 판매 음료는 " + name + " 이며, 가격은 " + price);
	}

	public Beverage(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
