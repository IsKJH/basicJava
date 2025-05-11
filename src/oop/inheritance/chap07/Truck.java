package oop.inheritance.chap07;

public class Truck extends Wheeler {
	public Truck(String carName, int velocity, int wheelNumber) {
		super(velocity, carName, wheelNumber);
	}

	public void speedUp(int speed) {
		if (velocity + (speed * 5) > 100) {
			velocity = 100;
		} else {
			velocity = velocity + (speed * 5);
		}
		System.out.println(carName + "의 현재 속도는 " + velocity + " 입니다.");
	}

	public void speedDown(int speed) {
		if (velocity - (speed * 5) < 50) {
			velocity = 50;
			System.out.println(carName + "의 최저속도위반으로 속도를 " + velocity + "으로 올립니다.");
		} else {
			velocity = velocity - (speed * 5);
		}
	}

}
