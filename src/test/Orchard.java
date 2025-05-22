package test;

public class Orchard {
	private int waterMelon;
	private int apple;
	private int peach;
	private int shineMusket;

	public void print() {
		System.out.println(toString());
	}

	public void manage(String fruit, int count) {
		switch (fruit) {
		case "waterMelon":
			setWaterMelon(getWaterMelon() + count);
			break;
		case "apple":
			setApple(getApple() + count);
			break;
		case "peach":
			setPeach(getPeach() + count);
			break;
		case "shineMusket":
			setShineMusket(getShineMusket() + count);
			break;
		}
	}

	public void buy() {

	}

	public void history(String fruit, int count) {

	}

	public Orchard() {
		super();
	}

	public Orchard(int waterMelon, int apple, int peach, int shineMusket) {
		super();
		this.waterMelon = waterMelon;
		this.apple = apple;
		this.peach = peach;
		this.shineMusket = shineMusket;
	}

	public int getWaterMelon() {
		return waterMelon;
	}

	public void setWaterMelon(int waterMelon) {
		this.waterMelon = waterMelon;
	}

	public int getApple() {
		return apple;
	}

	public void setApple(int apple) {
		this.apple = apple;
	}

	public int getPeach() {
		return peach;
	}

	public void setPeach(int peach) {
		this.peach = peach;
	}

	public int getShineMusket() {
		return shineMusket;
	}

	public void setShineMusket(int shineMusket) {
		this.shineMusket = shineMusket;
	}

	@Override
	public String toString() {
		return "과수원 과일수량 [waterMelon= " + waterMelon + "개, apple= " + apple + "개, peach= " + peach + "개, shineMusket= "
				+ shineMusket + "개]";
	}

}
