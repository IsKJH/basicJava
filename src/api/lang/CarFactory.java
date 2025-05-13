package api.lang;

public class CarFactory extends Factory implements IWorkingTogether {

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		return makeProducts('B');
	}

	@Override
	public int makeProducts(char skill) {
		if (skill == 'A') {
			return 3 * getWorkingTime();
		} else if (skill == 'B') {
			return 2 * getWorkingTime();
		} else if (skill == 'C') {
			return 1 * getWorkingTime();
		} else {
			return 0;
		}
	}

	public CarFactory(String name, int openHour, int closeHour) {
		super(openHour, closeHour, name);
	}

}
