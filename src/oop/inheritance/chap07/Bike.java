package oop.inheritance.chap07;

public class Bike extends Wheeler {
	public Bike(String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}

	public void speedUp(int speed) {
		if (velocity + speed > 40) {
			velocity = 40;
		} else {
			velocity += speed;
		}
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}

	public void speedDown(int speed) {
		if (velocity - speed < 10) {
			velocity = 10;
			System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");
		} else {
			velocity = velocity - speed;
		}
	}
}
