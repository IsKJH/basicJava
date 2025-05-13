package oop.polymorphism.chap07.inter;

public class Dog extends Animal {
	int speed;

	public Dog(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void run(int hours) {
		distance = speed * hours / 2;
		System.out.println(distance);
	}
}
