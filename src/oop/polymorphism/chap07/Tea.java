package oop.polymorphism.chap07;

public class Tea extends Beverage {
	static int amount;

	public Tea(String name) {
		super(name);
		calcPrice();
		amount++;
	}

	public Tea(String name, int amount) {
		super(name);
		Tea.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		Tea.amount = amount;
	}

	@Override
	public void calcPrice() {
		if (super.getName().equals("lemonTea")) {
			price = 1500;
		} else if (super.getName().equals("ginsengTea")) {
			price = 2000;
		} else if (super.getName().equals("redginsengTea")) {
			price = 2500;
		}
	}

}
