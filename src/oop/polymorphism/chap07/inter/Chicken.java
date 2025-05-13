package oop.polymorphism.chap07.inter;

public class Chicken extends Animal implements Cheatable {
	int speed;

	public Chicken(int speed) {
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
		distance = speed * hours;
		System.out.println(distance);
	}

	@Override
	public void fly() {
		distance += speed * 2;
		System.out.println(distance);
	}
}
