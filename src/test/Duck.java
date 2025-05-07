package test;

public class Duck {
	private String name;
	private int legs;
	private int length;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void fly() {
		System.out.println("오리(" + getName() + ")는 날지 않습니다.");
	}

	public void sing() {
		System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
	}

	public String toString() {
		return "오리의 이름은 " + getName() + " 입니다.";
	}
}
