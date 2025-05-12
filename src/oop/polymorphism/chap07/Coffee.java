package oop.polymorphism.chap07;

public class Coffee extends Beverage {
	static int amount;

	public Coffee(String name) {
		super(name);
		calcPrice();
		amount++;
	}

	public Coffee(String name, int amount) {
		super(name);
		Coffee.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Coffee.amount = amount;
	}

	@Override
	public void calcPrice() {
		if (super.getName().equals("Americano")) {
			price = 1500;
		} else if (super.getName().equals("CafeLatte")) {
			price = 2500;
		} else if (super.getName().equals("Cappuccino")) {
			price = 3000;
		}
	}

}
