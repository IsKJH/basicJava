package test;

public class CellPhoneMain {

	public static void main(String[] args) {
		CellPhone myPhone = new CellPhone("SCH-600");

		myPhone.charge(20); // 20분간 충전을 한다.
		myPhone.printBattery();

		myPhone.call(300); // 300분간 통화를 한다.
		myPhone.printBattery();

		myPhone.charge(50); // 50분간 충전을 한다.
		myPhone.printBattery();

		myPhone.call(40); // 40분간 통화를 한다.
		myPhone.printBattery();

		try {
			myPhone.call(-20); // 통화시간이 잘못 입력되었다.
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		CellPhone yourPhone = new CellPhone("SCH-600");

		if (myPhone.equals(yourPhone)) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
		}
	}

}

class CellPhone {
	private String model;
	private double battery;

	public void call(int time) {
		if (time < 0) {
			err();
		} else {
			System.out.println("통화 시간 : " + time + "분");
			if (getBattery() - (time * 0.5) > 0) {
				setBattery(getBattery() - (time * 0.5));
			} else {
				setBattery(0);
			}
		}
	}

	public void err() {
		System.out.println("통화시간입력오류");
	}

	public void charge(int time) {

		if (time * 3 > 100) {
			setBattery(100);
		} else {
			setBattery(time * 3);
		}
		System.out.println("충전 시간 : " + time + "분");
	}

	public void printBattery() {
		System.out.println("남은 배터리 양 : " + getBattery());

	}

	public boolean equals(Object otherObject) {
		return true;
	}

	public CellPhone() {
	}

	public CellPhone(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

}