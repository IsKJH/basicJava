package test;

public class Alcohol extends Drink {
	private double alcper;

	public static void printTitle() {
		System.out.println("상품명(도수[%]) \t 단가 \t 수량 \t 금액");
	}

	public void printData() {
		System.out
				.println(getName() + "(" + alcper + ")\t " + getPrice() + "\t " + getCount() + "\t " + getTotalPrice());
	}

	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}

	public double getAlcper() {
		return alcper;
	}

	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}

}
