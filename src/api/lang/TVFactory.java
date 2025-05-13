package api.lang;

public class TVFactory extends Factory implements IWorkingTogether {
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		return makeProducts('C');
	}

	@Override
	public int makeProducts(char skill) {
		if (skill == 'A') {
			return 8 * getWorkingTime();
		} else if (skill == 'B') {
			return 5 * getWorkingTime();
		} else if (skill == 'C') {
			return 3 * getWorkingTime();
		} else {
			return 1 * getWorkingTime();
		}

	}

	public TVFactory(String name, int openHour, int closeHour) {
		super(openHour, closeHour, name);
	}
}
