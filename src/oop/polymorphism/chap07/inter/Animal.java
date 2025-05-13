package oop.polymorphism.chap07.inter;

public abstract class Animal {
	int speed;
	double distance;

	public abstract void run(int hours);

	public Animal() {
		super();
	}

	public Animal(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
