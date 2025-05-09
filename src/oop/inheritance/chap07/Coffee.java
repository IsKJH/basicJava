package oop.inheritance.chap07;

public class Coffee extends Beverage {
	public String name;

	public Coffee(String type, int price, String name) {
		super(type, price);
		this.name = name;
	}

	public void print() {
		System.out.println("타입:" + type + ",가격:" + price + ",이름:" + name);
	}
}
